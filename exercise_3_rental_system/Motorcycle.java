 public class Motorcycle extends Vehicle {
    private boolean hasHelmetIncluded;
    private static final double LONG_RENTAL_DISCOUNT = 0.10;

         public Motorcycle(String licensePlate, String model, double dailyRate,
                      boolean hasHelmetIncluded) {
        super(licensePlate, model, dailyRate);
        this.hasHelmetIncluded = hasHelmetIncluded;
    }
     
            public boolean isHelmetIncluded() { return hasHelmetIncluded; }
    public void setHelmetIncluded(boolean hasHelmetIncluded) {
        this.hasHelmetIncluded = hasHelmetIncluded;
    }