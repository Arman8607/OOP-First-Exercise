public class Vehicle {
    private String licensePlate;
    private String model;
    private double dailyRate;
    private boolean isRented;

      public Vehicle(String licensePlate, String model, double dailyRate) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.dailyRate = dailyRate >= 0 ? dailyRate : 0;
        this.isRented = false;
    }
         
          public String getLicensePlate() { return licensePlate; }
    public String getModel() { return model; }
    public double getDailyRate() { return dailyRate; }
    public boolean isRented() { return isRented; }

      public void rentVehicle() { isRented = true; }
    public void returnVehicle() { isRented = false; }