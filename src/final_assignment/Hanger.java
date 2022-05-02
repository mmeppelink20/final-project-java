package src.final_assignment;

import java.util.Scanner;

import src.utilities.InputUtility;
import src.utilities.UIUtility;

public class Hanger {
    private Airplane[] airplanes = new Airplane[5];
    private int airplaneCount = 0;

    public Hanger() {

        airplanes[airplaneCount++] = new FighterJet("F-22 Raptor", 8, 1500, new Manufacturer("Lockheed Martin"));
        airplanes[airplaneCount++] = new FighterJet("F-14 Tomcat", 6, 1544, new Manufacturer("Northrop Grumman"));
        airplanes[airplaneCount++] = new FighterJet("F-16 Fighting Falcon", 6, 1350,
                new Manufacturer("General Dynamics"));
        airplanes[airplaneCount++] = new FighterJet("F-4 Phantom II", 8, 1473, new Manufacturer("McDonnell Douglas"));
    }

    public boolean isFull() {
        Boolean result = false;
        if (airplaneCount < 5) {
            result = true;
        }
        return result;
    }

    public void add(Scanner in) {

        if (isFull()) {
            UIUtility.showMenuTitle("Add a New Plane");

            String type = InputUtility.validateUserString("What type of plane would you like to add?\n",
                    new String[] { "Regular", "Fighter Jet" }, in);

            System.out.println();

            Airplane airplane = new Airplane();
            Manufacturer manufacturer = new Manufacturer();
            FighterJet fighterJet = new FighterJet();

            if (type.equalsIgnoreCase("Regular")) {

                // airplane name
                while (true) {
                    String airplaneName = InputUtility
                            .getString("What is the airplane's name? (Press q to quit at anytime)\n", in);
                    try {
                        if (airplaneName.equalsIgnoreCase("q")) {
                            return;
                        }
                        airplane.setAirplaneName(airplaneName);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                // manufacturer name
                while (true) {
                    String manufacturerName = InputUtility.getString("What is the manufacturer?\n", in);
                    manufacturer.setManufacturer(manufacturerName);
                    try {
                        if (manufacturerName.toString().equalsIgnoreCase("q")) {
                            return;
                        }
                        airplane.setAirplaneManufacturer(manufacturer);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                // max airplane speed
                while (true) {
                    String maxAirSpeed = InputUtility.getString("What is the max air speed?\n", in);
                    try {
                        if (maxAirSpeed.equalsIgnoreCase("q")) {
                            return;
                        }
                        airplane.setMaxAirspeed(Integer.parseInt(maxAirSpeed));
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }

            } else {

                fighterJet.setAirplaneName(fighterJet.toString());
                while (true) {
                    String fighterJetName = InputUtility
                            .getString("What is the fighter jet's name? (Press q to quit at anytime)\n", in);
                    try {
                        if (fighterJetName.equalsIgnoreCase("q")) {
                            return;
                        }
                        fighterJet.setAirplaneName(fighterJetName);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                // manufacturer name
                while (true) {
                    String manufacturerName = InputUtility.getString("What is the manufacturer?\n", in);
                    manufacturer.setManufacturer(manufacturerName);
                    try {
                        if (manufacturerName.toString().equalsIgnoreCase("q")) {
                            return;
                        }
                        fighterJet.setAirplaneManufacturer(manufacturer);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                // max airplane speed
                while (true) {
                    String maxAirSpeed = InputUtility.getString("What is the max air speed?\n", in);
                    try {
                        if (maxAirSpeed.equalsIgnoreCase("q")) {
                            return;
                        }
                        fighterJet.setMaxAirspeed(Integer.parseInt(maxAirSpeed));
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                // missiles
                while (true) {
                    String numMissiles = InputUtility.getString("How many missiles does it have?\n", in);
                    try {
                        if (numMissiles.equalsIgnoreCase("q")) {
                            return;
                        }
                        fighterJet.setNumMissiles(Integer.parseInt(numMissiles));
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }

            }

            if (type.equalsIgnoreCase("Regular")) {
                airplanes[airplaneCount++] = airplane;
            } else if (type.equalsIgnoreCase("Fighter Jet")) {
                airplanes[airplaneCount++] = fighterJet;
            }

            UIUtility.showMenuTitle("Plane added to the hanger");
        } else {
            System.out.println("\nNo planes can be added to the hanger\n");
        }

    }

    public void printHanger() {
        for (int i = 0; i < airplaneCount; i++) {
            System.out.println(airplanes[i]);
        }
    }

    public void sortHanger() {
        Airplane tempAirplane = new Airplane();

        Airplane[] airplanesCopy = airplanes.clone();

        for (int i = 0; i <= airplaneCount; i++) {
            for (int j = 0; j < airplaneCount - 1; j++) {
                if (airplanesCopy[j].compareTo(airplanesCopy[j + 1]) > 0) {
                    tempAirplane = airplanesCopy[j];
                    airplanesCopy[j] = airplanesCopy[j + 1];
                    airplanesCopy[j + 1] = tempAirplane;
                }
            }
        }

        for (int i = 0; i < airplaneCount; i++) {
            System.out.println(airplanesCopy[i]);
        }
    }

    public void removePlane(Scanner in) {
        int planeToRemove = InputUtility.getIntInRange("Enter a plane number to be removed: ", 1, airplaneCount, in);

        airplanes[planeToRemove - 1] = airplanes[airplaneCount - 1];
        airplanes[airplaneCount - 1] = null;

        airplaneCount--;

    }

    public void updatePlane(Scanner in) {
        String menuTitle = "Update a plane";
        String prompt = "Select a plane";
        String[] menuOptions = new String[airplaneCount];
        for(int i = 0; i < airplaneCount; i++) {
            menuOptions[i] = airplanes[i].toString();
        }
        int choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
        if(choice < 1 || choice > menuOptions.length) {
            System.out.println("Exiting update method");
            return;
        }
        Airplane airplane = airplanes[choice - 1];

        Manufacturer manufacturer = new Manufacturer();
        while(true) {
            String airplaneName = InputUtility.getString("Update plane name? [Press enter to keep '"+ airplane.getAirplaneName() +"']", in);
            if(airplaneName.equals("")) {
                break;
            }
            try {
                airplane.setAirplaneName(airplaneName);
                break;
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        
        while (true) {
            String manufacturerName = InputUtility.getString("Update manufacturer?[Press enter to keep '"+ airplane.getAirplaneManufacturer() +"']", in);
            
            if(manufacturerName.equals("")) {
                break;
            }
            try {
                manufacturer.setManufacturer(manufacturerName);
                airplane.setAirplaneManufacturer(manufacturer);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while(true) {
            String airplaneSpeed = InputUtility.getString("Update plane speed? [Press enter to keep '"+ airplane.getMaxAirSpeed() +"']", in);
            if(airplaneSpeed.equals("")) {
                break;
            }
            try {
                airplane.setMaxAirspeed(Integer.parseInt(airplaneSpeed));
                break;
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        if(airplane instanceof FighterJet) {
            FighterJet fighterJet = (FighterJet) airplanes[choice - 1];
            while(true) {
                String fighterJetMissileCount = InputUtility.getString("Update number of  missiles? [Press enter to keep '"+ fighterJet.getMissileCount() +"']", in);
                if(fighterJetMissileCount.equals("")) {
                    break;
                }
                try {
                    fighterJet.setNumMissiles(Integer.parseInt(fighterJetMissileCount));
                    break;
                } catch(IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
