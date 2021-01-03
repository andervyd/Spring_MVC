package by.andervyd.employee;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "short name")
    private String firstName;
//    @NotNull(message = "required field")
//    @NotEmpty(message = "required field")
    @NotBlank(message = "required field")
    private String lastName;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;
    private String department;
    @Min(value = 500, message = "salary minimum 499$")
    @Max(value = 5000, message = "salary maximum 5001$")
    private int salary;
    private String layout;
    private String[] languages;
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

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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