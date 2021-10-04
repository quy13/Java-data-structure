package com.example.passing_objects_as_method_parameters;

public class Employee {
    private String firstName;
    private String LastName;
    private int id;
    private String department;
    private String positions;
    private Double monthlySalary;

    public Employee(String firstName, String lastName, int id, String department, String positions, Double monthlySalary) {
        this.firstName = firstName;
        LastName = lastName;
        this.id = id;
        this.department = department;
        this.positions = positions;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getPositions() {
        return positions;
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
