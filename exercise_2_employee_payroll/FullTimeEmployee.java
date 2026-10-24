 public class FullTimeEmployee extends Employee {

      private double bonus;
    private double medicalAllowance;

         public FullTimeEmployee(int id, String name, double baseSalary,
                            double bonus, double medicalAllowance) {
        super(id, name, baseSalary);
        this.bonus = bonus;
        this.medicalAllowance = medicalAllowance;
    }