import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class RobotMap {

    private final int n;
    private final int m;
    private final List<IRobot> robots;

    public RobotMap(int n, int m) {
        this.n = n;
        this.m = m;
        this.robots = new ArrayList<>();
    }

    public IRobot createRobot(Point point) {
        validatePoint(point);
        IRobot robot = new Robot(point);
        robots.add(robot);

        return robot;
    }

    public void acceptRobots(Consumer<IRobot> robotAcceptor) {
        for (IRobot robot : robots) {
            robotAcceptor.accept(robot);
        }
    }

    public Optional<IRobot> getById(Long id) {
        for (IRobot robot : robots) {
            if (id.equals(robot.getID())) {
                return Optional.of(robot);
            }
        }

        return Optional.empty();
    }

    public void deleteById(Long id){
        for (int i = 0; i < robots.size(); i++) {
            if(robots.get(i).getID() == id){
                robots.remove(i);
            }
        }
    }

    private void validatePoint(Point point) {
        validatePointIsCorrect(point);
        validatePointIsFree(point);
    }

    private void validatePointIsCorrect(Point point) {
        if (point.x() < 0 || point.x() > n || point.y() < 0 || point.y() > m) {
            throw new IllegalStateException("Некоректное значение точки!");
        }
    }

    private void validatePointIsFree(Point point) {
        for (IRobot robot : robots) {
            Point robotPoint = robot.getPoint();
            if (robotPoint.equals(point)) {
                throw new IllegalStateException("Точка " + point + " занята!");
            }
        }
    }
    public interface IRobot{
        void changeDirection(Direction direction);
        void move();
        Point getPoint();
        Long getID();
    }

    public class Robot implements IRobot{

        public static final Direction DEFAULT_DIRECTION = Direction.TOP;

        private static Long idCounter = 1L;

        private final Long id;
        private Direction direction;
        private Point point;

        public Robot(Point point) {
            this.id = idCounter++;
            this.direction = DEFAULT_DIRECTION;
            this.point = point;
        }
        @Override
        public void changeDirection(Direction direction) {
            this.direction = direction;
        }
        @Override
        public void move() {
            Point newPoint = switch (direction) {
                case TOP -> new Point(point.x() - 1, point.y());
                case RIGHT -> new Point(point.x(), point.y() + 1);
                case BOTTOM -> new Point(point.x() + 1, point.y());
                case LEFT -> new Point(point.x(), point.y() - 1);
            };
            validatePoint(newPoint);

            System.out.println("Робот переместился с " + point + " на " + newPoint);
            this.point = newPoint;
        }

        @Override
        public Point getPoint() {
            return point;
        }

        @Override
        public Long getID() {
            return id;
        }

        @Override
        public String toString() {
            return "[" + id + "] " + point.toString() + " [" + direction.name() + "]";
        }
    }

}
