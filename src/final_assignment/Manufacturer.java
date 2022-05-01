package src.final_assignment;

public class Manufacturer implements Comparable<Manufacturer> {
    private String manufacturer;

    Manufacturer(){
        manufacturer = "";
    }

    Manufacturer(String manufacturer) {
        validateManufacturer(manufacturer);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        validateManufacturer(manufacturer);
        this.manufacturer = manufacturer;
    }
    
    private void validateManufacturer(String manufacturer) {
        if(manufacturer == null || manufacturer.equals("")) {
            throw new IllegalAccessError("Manufacturer name is required");
        }
    }

    @Override
    public String toString() {
        return manufacturer;
    }

    @Override
    public int compareTo(Manufacturer o) {
        int result = this.manufacturer.compareTo(o.manufacturer);
        return result;
    }
}
