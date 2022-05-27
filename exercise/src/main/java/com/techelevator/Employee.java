package com.techelevator;

public class Employee {

    private long employeeId = 0;
    private String firstName = "";
    private String lastName = "";
    private String email = "";
    public double salary = 0.00;
    private Department department = new Department(0, "");
    private String hireDate = "";
    public final static double STARTING_SALARY = 60000.00;

    //Getters
    public long getEmployeeId(){
        return employeeId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public double getSalary(){
        return salary;
    }

    public Department getDepartment(){
        return department;
    }

    public String getHireDate(){
        return hireDate;
    }

    //Setters
    public void setEmployeeId(long employeeId){
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    // consider the possibility of edge cases or the wrong stuff getting entered here
    // could protect against that with an if statement maybe

    public void setDepartment(Department department){
        this.department = department;
    }

    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }

    //Constructors
    public Employee (int employeeId, String firstName, String lastName, String email, Department department, String hireDate){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        salary = STARTING_SALARY;
    }

    public Employee () {
    }

    //Methods
    public String getFullName(){
        return getLastName() + ", " + getFirstName();
    }

    public void raiseSalary(double percent){
        salary += salary * (percent / 100);
    }
}
