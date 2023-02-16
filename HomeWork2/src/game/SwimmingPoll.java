package game;

public class SwimmingPoll {

    private final int distance;

    public SwimmingPoll(int distance) {
        this.distance = distance;
    }

    public boolean pass(Participant participant) {
        return participant.getSwim() >= distance;
    }
}
