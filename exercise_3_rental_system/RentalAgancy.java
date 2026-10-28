 import java.util.ArrayList;
import java.util.List;
public class RentalAgency {
    private String agencyName;
    private List<Vehicle> fleet;

       public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
        this.fleet = new ArrayList<>();
    }

         public void addVehicle(Vehicle vehicle) { fleet.add(vehicle); }

            public void displayAvailableVehicles() {
        System.out.println("\\nAvailable vehicles at " + agencyName + ":");
        boolean found = false;
        for (Vehicle vehicle : fleet) {
            if (!vehicle.isRented()) {
                vehicle.displayDetails();
                System.out.println("--------------------");
                found = true;
            }
        }
        if (!found) System.out.println("No vehicles are currently available.");
    }