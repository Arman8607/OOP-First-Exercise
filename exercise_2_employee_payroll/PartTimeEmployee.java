 public class PartTimeEmployee extends Employee {

        private int hoursWorked;
    private double hourlyRate;

       public PartTimeEmployee(int id, String name, int hoursWorked,
                            double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
         
            public int getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        } else {
            System.out.println("Error: Hours worked cannot be negative.");
        }
    }
    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        } else {
            System.out.println("Error: Hourly rate cannot be negative.");
        }
    }