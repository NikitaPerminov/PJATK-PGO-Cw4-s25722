import java.util.Objects;
import java.util.Random;

public class Employee {

    private String idEmployee;
    private String name;
    private String lastName;
    private double baseSalary;

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(idEmployee, employee.idEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idEmployee);
    }

    public final String getIdOfEmployee(){
        return idEmployee;
    }

    public double countCostPerMonth(){
        return baseSalary;
    }

    public String introduceYourself(){
        return "My name is " + name + " " + lastName;
    }


    public Employee(String idEmployee, String name, String lastName, double baseSalary) {
        this.setIdEmployee(idEmployee);
        this.name = name;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        Random random = new Random();
        int generatedId = 10000 + random.nextInt(990000);
        this.idEmployee = String.valueOf(generatedId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null");
        }
        this.lastName = lastName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }
}
