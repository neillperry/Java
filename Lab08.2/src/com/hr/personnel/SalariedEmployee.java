package com.hr.personnel;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    //CONSTRUCTORS
    // ZERO-argument constructor
    public SalariedEmployee() {
    }

    // THREE-argument constructor
    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        setSalary(salary);
    }

    // Gettor
    public double getSalary() {
        return salary;
    }

    // Settor
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // TO STRING
    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                '}';
    }
}
