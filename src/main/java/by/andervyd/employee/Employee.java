package by.andervyd.employee;

public class Employee {

    private String firstName;
    private String lastName;
    private String department;
    private int salary;

    public Employee() {
        // default
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee [ name: " + firstName +
                ", surname: " + lastName +
                ", department: " + department +
                ", salary: " + salary + "$ ]";
    }
}
