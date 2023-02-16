package game;

public class SwimObstacleAdapter implements Obstacle {

    private final SwimmingPoll swimPool;

    public SwimObstacleAdapter(SwimmingPoll swimPool) {
        this.swimPool = swimPool;
    }

    @Override
    public boolean pass(Participant participant) {
        return swimPool.pass(participant);
    }
}
