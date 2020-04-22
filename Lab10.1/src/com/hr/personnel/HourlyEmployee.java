/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The HourlyEmployee class is a fairly simple class.  It mainly serves as a simple 
 * derived class to illustrate inheritance.
 * 
 * HourlyEmployee includes the following properties:
 *   double rate - hourly pay
 *   double hours - time worked in a pay period.
 *  
 *  HourlyEmployee includes the following methods (besides get/set methods)
 *  String toString(): Generates string from HourlyEmployee object.
 *
 */
 
package com.hr.personnel;

import gov.irs.IllegalWageException;

import java.time.LocalDate;

// TODO: Implement the TaxPayer method in this class.  Note that we don't have to say "implements TaxPayer"
// again, because it inherits this from Employee.  Another example of IS-A
// HourlyEmployee IS-A Employee, and Employee IS-A TaxPayer, then HourlyEmployee IS-A TaxPayer.
public class HourlyEmployee
extends Employee {
  // CLASS CONSTANTS
  public static final double TAX_RATE = 0.25;
  public static final double FEDERAL_MINIMUM = 7.25;

  // INSTANCE VARIABLES
  private double rate;
  private double hours;
  
  // CONSTRUCTORS
  public HourlyEmployee() {
  }
  
  public HourlyEmployee(String name, LocalDate hireDate) {
    setName(name);
    setHireDate(hireDate);
  }
  
  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours)
  throws IllegalArgumentException, IllegalWageException {
    setName(name);
    setHireDate(hireDate);
    setRate(rate);
    setHours(hours);
  }
  
  // BEHAVIORAL METHODS
  // Implement pay() method by printing message: <name> is paid hourly <value>
  public void pay() {
    System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
  }
  
  // ACCESSOR METHODS
  public double getRate() {
    return rate;
  }

  public void setRate(double rate) throws IllegalWageException {
    if (rate < FEDERAL_MINIMUM) {
      throw new IllegalWageException("ERROR: can't pay employees less than minimum wage");
    } else {
      this.rate = rate;
    }
  }

  /*
 public void setRate(double rate) throws IllegalArgumentException{
    if (rate < FEDERAL_MINIMUM) {
      throw new IllegalArgumentException("ERROR: can't pay employees less than minimum wage");
    } else {
      this.rate = rate;
    }
  }
   */
  
  public double getHours() {
    return hours;
  }
  public void setHours(double hours) throws IllegalArgumentException {
    if (0 <= hours && hours <= 40) {
      this.hours = hours;
    } else {
      throw new IllegalArgumentException("ERROR: Invalid hours: valid range is 0 to 40");
    }

  }

  // Have toString() include Employee.toString() value
  @Override
  public String toString() {
	  return "HourlyEmployee [rate=" + rate + ", hours=" + hours + ", toString()=" + super.toString() + "]";
  }

  @Override
  public void payTaxes() {
    double taxes = rate * hours * TAX_RATE;
    System.out.println(super.getName() + " owes " + taxes + " in taxes.");
  }
}