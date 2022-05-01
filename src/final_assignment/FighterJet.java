package src.final_assignment;

public class FighterJet extends Airplane {
    private int numMissiles;

    public FighterJet() {
        super();
        numMissiles = 0;
    }

    public FighterJet(String fighterJetName, int numMissiles, int maxAirSpeed, Manufacturer manufacturerName) {
        super(fighterJetName, manufacturerName, maxAirSpeed);
        
        validateNumMissiles(numMissiles);
        this.numMissiles= numMissiles;
    }

    public int getMissileCount() {
        return numMissiles;
    }

    public void setNumMissiles(int numMissiles) {
        validateNumMissiles(numMissiles);
        this.numMissiles = numMissiles;
    }

    private void validateNumMissiles(int numMissiles) {
        if(numMissiles == 0) {
            throw new IllegalArgumentException("Our planes need to have missiles to be a fighter jet");
        }
    }

    @Override
    public String toString() {
        return String.format("Fighter Jet: %s\nManufacturer: %s\nMax air speed: %d mph\nMissile Count: %d\n", getAirplaneName(), getAirplaneManufacturer(), getMaxAirSpeed(), numMissiles);
    }
}
