package by.andervyd.employee;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String firstName;
    private String lastName;
    private String department;
    private int salary;
    private String layout;
/*
    // add selected
    private Map<String, String> departments;
*/

    public Employee() {
/*
        // add selected
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");
*/
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

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    /*
    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }
*/

    public String toString() {
        return "Employee [ name: " + firstName +
                ", surname: " + lastName +
                ", department: " + department +
                ", salary: " + salary + "$ ]";
    }
}
