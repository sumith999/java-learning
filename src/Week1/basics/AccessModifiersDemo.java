package Week1.basics;

class Employee {
    public String name;
    private int salary;
    protected String department;
    String role;

    Employee(String name, int salary, String department, String role) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    void show() {
        System.out.println(name + " " + salary + " " + department + " " + role);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        Employee e = new Employee("Sumith", 50000, "IT", "Developer");
        e.show();
        System.out.println("Salary: " + e.getSalary());
    }
}
