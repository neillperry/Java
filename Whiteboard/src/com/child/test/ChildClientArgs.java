package com.child.test;

import java.time.LocalDate;
import com.child.Child;
import com.child.EyeColor;
import com.child.HairColor;

class ChildClientArgs {

    // configuration file passes in the following String array: Gertrude 2014-09-13 BROWN BROWN true
    public static void main(String[] args) {

        // check to see that 5 args are passed in
        if (args.length < 5) {

            // if the String array has less than 5 elements, then print out error
            System.out.println("ERROR: five inputs needed to create a child");

        } else {

            // else pass the String array to create an instance of a child
            Child kid = createChild(args);

            // call a method on the kid instance
            kid.cries();
            kid.annoys();
        }
    }



    // private method to create a Child instance
    private static Child createChild(String[] args) {
        // A. parse the String[] to cast the appropriate variables
        String name = args[0];
        LocalDate dob = LocalDate.parse(args[1]);
        EyeColor eyeColor = EyeColor.valueOf(args[2]);
        HairColor hairColor = HairColor.valueOf(args[3]);
        boolean brat = Boolean.valueOf(args[4]);

        // B. now with the five variables in the appropriate format, create a child
        Child kiddo = new Child(name, dob, eyeColor, hairColor, brat);

        // C. return Child instance so that main method can manipulate it
        return kiddo;
    }
}
