 public class Car extends Vehicle {
    private int numberOfSeats;
    private static final double SERVICE_FEE = 20.0;

      public Car(String licensePlate, String model, double dailyRate, int numberOfSeats) {
        super(licensePlate, model, dailyRate);
        this.numberOfSeats = numberOfSeats;
    }