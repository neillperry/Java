package com.child.test;

import java.time.LocalDate;
import com.child.Child;
import com.child.EyeColor;
import com.child.HairColor;


class ChildClientTest {

    public static void main(String[] args) {

        // call the 5-argument constructor in Child class
        Child kiddo = new Child("Alexander", LocalDate.of(2010, 11, 11), EyeColor.GREEN, HairColor.BROWN, false);

        // call methods on the Child instance
        kiddo.toCry();
        kiddo.eats();
    }
}
