package game;

public class HunterObstacleAdapter implements Obstacle {
    private final Hunter hunter;

    public HunterObstacleAdapter(Hunter hunter) {
        this.hunter = hunter;
    }

    @Override
    public boolean pass(Participant participant) {
        return hunter.pass(participant);
    }
}
