/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * 
 * The Department class manages employees
 * 
 * The class includes the following properties:
 *   String name, location.
 *   Employee[] employees: The employees in the department (in an array).
 *   int currentIndex: Internal counter for number of employees in the department
 *    *  
 *  The class includes the following methods (besides get/set methods)
 *  void listEmployees(): Output info on all employees in the dept.
 *  void workEmployees(): Tell all the employees in the dept. to work.
 *  String toString(): Generates string from an instance.
 *    
 */

package com.hr.personnel;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;



public class Department {
  // INSTANCE VARIABLES
  private String name;
  private String location;
  private List<Employee> employees = new ArrayList<>();

  
  // CONSTRUCTORS
  public Department() {
  }
  
  public Department(String name, String location) {
    setName(name);
    setLocation(location);
  }
  
  // BEHAVIORAL METHODS
  public void listEmployees() {
    for (Employee emp: employees) {
      System.out.println(emp);
    }
  }
  
  public void workEmployees() {
    for (Employee emp: employees) {
      emp.work();
    }
  }
  
  // Implement payEmployees() method by calling pay() on each Employee
  // it will look similar to the workEmployees() method above
  public void payEmployees() {
    for (Employee emp: employees) {
      emp.pay();
    }
  }
  
  // helper method to add an Employee to the array
  public void addEmployee(Employee emp) {
    employees.add(emp);
  }
  
  // ACCESSOR METHODS
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  public String toString() {
    return "Department: name=" + getName() + ", location=" + getLocation();
  }
}