package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();
    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {

        // create some departments
        createDepartments();
        Department marketingDept = new Department(1, "Marketing");
        departments.add(marketingDept);
        Department salesDept = new Department(2, "Sales");
        departments.add(salesDept);
        Department engiDept = new Department(3, "Engineering");
        departments.add(engiDept);
        // print each department by name
        printDepartments();
        for(Department departmentId : departments){
            System.out.println(departmentId.getName());
        }
        // create employees
        createEmployees();
        Employee employeeDean = new Employee(1,"Dean", "Johnson", "djohnson@teams.com", engiDept, "08/21/2020");
        Employee employeeAngie = new Employee(2,"Angie", "Smith", "asmith@teams.com", engiDept, "08/21/2020");
        Employee employeeMargaret = new Employee(3,"Margaret", "Thompson", "mthompson@teams.com", marketingDept, "08/21/2020");
        employees.add(employeeDean);
        employees.add(employeeAngie);
        employees.add(employeeMargaret);

        // give Angie a 10% raise, she is doing a great job!
        employeeAngie.raiseSalary(10);
        // print all employees
        printEmployees();
        for (Employee allEmployees : employees)
            System.out.println(allEmployees.getLastName() + ", " + allEmployees.getFirstName() + " (" + allEmployees.getSalary() + ") " + allEmployees.getDepartment().getName());
        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
