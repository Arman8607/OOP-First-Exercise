 public class Employee {
    private int id;
    private String name;
    private double baseSalary;

        public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            this.baseSalary = 0.0;
            System.out.println("Error: Base salary cannot be negative.");
        }
    }