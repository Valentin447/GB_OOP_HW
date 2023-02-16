package game;

public abstract class BaseParticipant implements Participant {

    private final String name;
    private final int jump;
    private final int run;
    private final int swim;
    private final int stealth;

    public BaseParticipant(String name, int jump, int run, int swim, int stealth) {
        this.name = name;
        this.jump = jump;
        this.run = run;
        this.swim = swim;
        this.stealth = stealth;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getJump() {
        return jump;
    }

    @Override
    public int getRun() {
        return run;
    }

    @Override
    public int getSwim() {
        return swim;
    }

    @Override
    public int getStealth() {
        return swim;
    }

}
