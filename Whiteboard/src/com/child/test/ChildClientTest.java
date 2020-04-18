package com.child.test;

import java.time.LocalDate;
import com.child.Child;
import com.child.EyeColor;
import com.child.HairColor;


class ChildClientTest {

    public static void main(String[] args) {

        // call the 5-argument constructor in Child class
        Child kid1 = new Child("Alexander", LocalDate.of(2004, 11, 11), EyeColor.GREEN, HairColor.BROWN, false);

        // call methods on the Child instance
        kid1.cries();
        kid1.eats();
        System.out.println(kid1.toString());
        // change the kid's hair color to green
        kid1.setHairColor(HairColor.GREEN);
        System.out.println(kid1.toString());

        // verify that the kid's hair color has changed
        kid1.annoys();

        // create another instance of the Child
        Child kid2 = new Child("Samantha", LocalDate.of(2020, 2, 9), EyeColor.BLOODSHOT, HairColor.BLONDE, true);

        // call the poop method on the child
        kid2.poops();
    }
}
