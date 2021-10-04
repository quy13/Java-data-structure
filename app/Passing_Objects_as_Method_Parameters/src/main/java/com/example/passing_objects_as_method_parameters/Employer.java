package com.example.passing_objects_as_method_parameters;

public class Employer {
    private String name;
    private String location;

    public Employer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer(){

    }
    public boolean areRelated(Employee employeeA, Employee employeeB) {
        if (employeeA.getLastName() == employeeB.getLastName()) {
            return true;
        }else
            return false;
    }
    public void calculateAnnualBonus(Employee employee) {
        double annualBonus = (employee.getMonthlySalary() * 0.15) * 11;
        System.out.println("Annual bonus for " + employee.getFirstName() + " is " + annualBonus);
    }

    public void employeeDetail(Employee employee){
        System.out.println("ID: " + employee.getId()
                + " Name: " + employee.getFirstName() + " " + employee.getLastName()
                + " Department: " + employee.getDepartment() +
                " Position: " + employee.getPositions()
                + " Monthly Salary: " + employee.getMonthlySalary());;
    }
}
