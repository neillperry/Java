package com.child;

import java.time.LocalDate;
import java.time.Period;

public class Child {
    // PROPERTIES
    private String name;
    private LocalDate dob;
    private EyeColor eyeColor;
    private HairColor hairColor;
    private boolean isABrat;

    // OTHER PROPERTIES
    private boolean isHungry;

    // CONSTRUCTORS
    // 5-argument constructor
    public Child(String name, LocalDate dob, EyeColor eyeColor, HairColor hairColor, boolean brat) {
        if (isAgePositive(dob)) {
            setName(name);
            setDob(dob);
            setEyeColor(eyeColor);
            setHairColor(hairColor);
            setIsABrat(brat);
        } else {
            System.out.println("ERROR: Inputted Age is Negative. A child instance will be created only for chlidren already born.");
        }

    }

    // ZERO-argument constructor
    public Child() { }

    // To String Method
    public String toString() {
        return "Child: name=" + getName() + ", DOB:" + getDob()
                + ", Eye Color=" + getEyeColor() + ", Hair Color=" + getHairColor() + ", Brattiness: " + getIsABrat(); }

    // GETTORS
    public String getName(){
        return this.name;
    }

    public LocalDate getDob(){
        return this.dob;
    }

    public EyeColor getEyeColor() {
        return this.eyeColor;
    }

    public HairColor getHairColor(){
        return this.hairColor;
    }

    public boolean getIsABrat() { return this.isABrat; }

    // SETTORS
    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate birthDate){
        this.dob = birthDate;
    }

    public void setEyeColor(EyeColor color){
        this.eyeColor = color;
    }

    public void setHairColor(HairColor color){
        this.hairColor = color;
    }

    public void setIsABrat(boolean brat) {
        this.isABrat = brat;
    }

    //METHODS
    // calculate the time between a given date and today (future dates are negative)
    public int calculateAge(LocalDate date) {
        LocalDate today = LocalDate.now();
        Period period = Period.between(date, today);
        int age = period.getYears();
        return age;
    }

    // validate date of birth is in the past (returns false if date is in the future)
    public boolean isAgePositive(LocalDate date){
        int age;
        boolean returnValue = false;
        age = calculateAge(date);
        if (age >= 0) {
            returnValue = true;
        }
        return returnValue;
    }

    // BUSINESS METHODS
    // cries = prints out a wail
    public void cries(){
        System.out.println("WAAAAAAAAAAHAAHAHAHAHAAH");
    }

    // annoys method is age specific to Child instance
    public void annoys() {
        int age = calculateAge(dob);
        if (age < 2) {
            cries();
        } else if (age < 12) {
            System.out.println("I'm so bored!");
        } else if (age < 18) {
            System.out.println("give me money");
        };
    }

    // eats method updates child's isHungry variable to false
    public void eats(){
        isHungry = false;
    }

    // poops prints out a String alert
    public void poops() {
        System.out.println("Child has pooped. May need to change diapers");
    }
}
