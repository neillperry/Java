/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * Lab - Interfaces
 * 
 * This is the main class where the application starts.
 * 
 * It creates an IRS instance, registers employees with it, then collects taxes from them
 * 
 */
package com.hr.personnel.client;

import java.time.LocalDate;

import com.hr.corp.Corporation;
import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import gov.irs.IRS;
import gov.irs.IllegalWageException;

public class Client {

  public static void main(String[] args) {

	IRS irs = new IRS();  // Create an IRS instance.

      // create Employees (Hourly or Salaried), and register them with the IRS
      irs.register(new HourlyEmployee("Jason", LocalDate.of(1990,8,24), 22.50, 40));
      irs.register(new SalariedEmployee("Tina", LocalDate.of(2000,2,2), 1250));
      irs.register(new HourlyEmployee("John", LocalDate.of(2010, 10, 11), 8, 40));
      irs.register(new SalariedEmployee("Jane", LocalDate.of(2005,7,1), 1500));


      // create Department object
      Department dept = new Department("Sales", "Seattle");

      // add Employees to it
      dept.addEmployee(new SalariedEmployee("Beetlejuice", LocalDate.of(1912, 4, 19), 52000.0));
      dept.addEmployee(new HourlyEmployee("Mance Raider", LocalDate.of(931, 3, 29), 34.0, 30.0));
      dept.addEmployee(new SalariedEmployee("Steve Spurrier", LocalDate.of(1912, 4, 19), 24498.0));
      dept.addEmployee(new HourlyEmployee("Scottie Pippen", LocalDate.of(931, 3, 29), 14.0, 10.0));
      dept.addEmployee(new SalariedEmployee("Aaron Burr", LocalDate.of(1912, 4, 19), 81000.0));
      dept.addEmployee(new HourlyEmployee("Squeker the Muppet", LocalDate.of(931, 3, 29), 20.0, 15.0));


      // list its Employees
      System.out.println("\nList employees:");
      dept.listEmployees();


      // make its Employees work
      System.out.println("\nMake employees work:");
      dept.workEmployees();

      // make its Employees work
      System.out.println("\nPay employees:");
      dept.payEmployees();


      // IRS collects taxes
      System.out.println("IRS collects taxes");
      irs.collectTaxes();

  }
}