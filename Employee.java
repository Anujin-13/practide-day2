public class Employee {
    private String name;
    private double salary;

    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double calculateBonus() {
        return salary * 0.1;
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Bat", 1500000);
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Bonus: " + emp.calculateBonus());
    }
}
