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
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import gov.irs.IRS;
import gov.irs.IllegalWageException;

public class Client {

  public static void main(String[] args) {

	IRS irs = new IRS();  // Create an IRS instance.
      try  {
          // create Employees (Hourly or Salaried), and register them with the IRS
          irs.register(new HourlyEmployee("Jason", LocalDate.of(1990,8, 16), 4, 20));
          irs.register(new HourlyEmployee("John", LocalDate.of(2010, 10, 11), 8, 40));
      } catch(IllegalWageException e) {
          System.out.println("Stop trying to underpay your workers");
      } catch (IllegalArgumentException e) {
          System.out.println("Stop trying to work them full time, you idiot!");
      }
  }
}