package com.techelevator;

public class Department {
    private int departmentId = 0;
    private String name = "";

    //getters
    public int getDepartmentId() {
       return departmentId;
    }
    public String getName() {
        return name;
    }

    //setters
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public void setName(String name) {
        this.name = name;
    }

    //constructor
    public Department (int departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
    }


}
