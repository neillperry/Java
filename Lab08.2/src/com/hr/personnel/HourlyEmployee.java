package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    //CONSTRUCTORS
    // ZERO-argument constructor
    public HourlyEmployee() {
    }

    //FOUR-argument constructor
    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    // GETTORS
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    // SETTORS
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    //TO STRING

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
