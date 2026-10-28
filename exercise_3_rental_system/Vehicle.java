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