package com.techelevator;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();
    Map<String, Project> projects = new HashMap<>();

    /**
     * The main entry point in the application
     *
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
        for (Department departmentId : departments) {
            System.out.println(departmentId.getName());
        }
        // create employees
        createEmployees();
        Employee employeeDean = new Employee(1, "Dean", "Johnson", "djohnson@teams.com", engiDept, "08/21/2020");
        Employee employeeAngie = new Employee(2, "Angie", "Smith", "asmith@teams.com", engiDept, "08/21/2020");
        Employee employeeMargaret = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", marketingDept, "08/21/2020");
        employees.add(employeeDean);
        employees.add(employeeAngie);
        employees.add(employeeMargaret);

        // give Angie a 10% raise, she is doing a great job!
        employeeAngie.raiseSalary(10);
        // print all employees
        printEmployees();
        for (Employee allEmployees : employees)
            System.out.println(allEmployees.getFullName() + " (" + allEmployees.getSalary() + ") " + allEmployees.getDepartment().getName());
        // create the TEams project
        createTeamsProject();
        Project teamsProject = new Project("TEams", "Project Management Software", "10/10/2020", "11/10/2020");
        List<Employee> engiEmployees = new ArrayList<>();
        for (Employee engineers : employees) {
            if (engineers.getDepartment() == engiDept) {
                engiEmployees.add(engineers);
            }
        }
        teamsProject.setTeamMembers(engiEmployees);


        projects.put("TEams", teamsProject);
        // create the Marketing Landing Page Project
        createLandingPageProject();
        Project marketingLandingPageProject = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");
        List<Employee> marketingEmployees = new ArrayList<>();
        for (Employee marketers : employees) {
            if (marketers.getDepartment() == marketingDept) {
                marketingEmployees.add((marketers));
            }
        }
        for (Employee allEmployees : employees) {
            if (allEmployees.getDepartment() == marketingDept) {
                marketingLandingPageProject.setTeamMembers(employees);
            }
        }
        marketingLandingPageProject.setTeamMembers(marketingEmployees);
        projects.put("Marketing Landing Page Project", marketingLandingPageProject);
        // print each project name and the total number of employees on the project
        printProjectsReport();
        for (Map.Entry<String, Project> projectStatus : projects.entrySet()) {
            System.out.println(projectStatus.getKey() + ": " + projectStatus.getValue().getTeamMembers().size());
        }
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
