package src.final_assignment;

public class Airplane implements Comparable<Airplane> {
    private String airplaneName;
    private Manufacturer manufacturerName;
    private int maxAirSpeed;

    public Airplane() {
        this.airplaneName = "Empty";
        this.manufacturerName = new Manufacturer("Empty");
        this.maxAirSpeed = 0;
    }

    public Airplane(String airplaneName, Manufacturer manufacturerName, int maxAirSpeed) {
        validateAirplaneName(airplaneName);
        this.airplaneName = airplaneName;

        validateManufacturerName(manufacturerName);
        this.manufacturerName = manufacturerName;

        validateAirSpeed(maxAirSpeed);
        this.maxAirSpeed = maxAirSpeed;
    }

    // airplane name
    private void validateAirplaneName(String airplaneName) {
        if (airplaneName == null || airplaneName.equals("")) {
            throw new IllegalArgumentException("An airplane name is required.");
        }
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        validateAirplaneName(airplaneName);
        this.airplaneName = airplaneName;
    }

    // max air speed
    private void validateAirSpeed(int maxAirSpeed) {
        if (maxAirSpeed < 0) {
            throw new IllegalArgumentException("Max air speed cannot be less than 0");
        }
    }

    public void setMaxAirspeed(int maxAirSpeed) {
        validateAirSpeed(maxAirSpeed);
        this.maxAirSpeed = maxAirSpeed;
    }

    public int getMaxAirSpeed() {
        return this.maxAirSpeed;
    }

    // Manufacturer
    private void validateManufacturerName(Manufacturer manufacturerName) {
        if (manufacturerName == null) {
            throw new IllegalArgumentException("Manufacturer name is required");
        }
    }

    public Manufacturer getAirplaneManufacturer() {
        return manufacturerName;
    }

    public void setAirplaneManufacturer(Manufacturer manufacturerName) {
        validateManufacturerName(manufacturerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    public String toString() {
        return String.format("Airplane: %s\nManufacturer: %s\nMax air speed: %d mph\n", airplaneName, manufacturerName,
                maxAirSpeed);
    }

    @Override
    public int compareTo(Airplane o) {
        int result = this.airplaneName.compareTo(o.airplaneName);

        if (result == 0) {
            result = this.manufacturerName.compareTo(o.manufacturerName);
        }
        return result;
    }

}
