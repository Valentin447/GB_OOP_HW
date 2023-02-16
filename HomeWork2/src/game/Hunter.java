package game;

public class Hunter {

    private final int vigilance;

    public Hunter(int vigilance) {
        this.vigilance = vigilance;
    }

    public boolean pass(CanStealth canStealth) {
        return canStealth.getStealth() >= vigilance;
    }
}
