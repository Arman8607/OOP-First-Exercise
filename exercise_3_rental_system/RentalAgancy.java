 import java.util.ArrayList;
import java.util.List;
public class RentalAgency {
    private String agencyName;
    private List<Vehicle> fleet;

       public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
        this.fleet = new ArrayList<>();
    }