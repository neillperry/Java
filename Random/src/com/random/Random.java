package com.random;

/*
*  This is a coding challenge that we were given.
*  The requirements: basically this does exactly what was required
*
* */
public class Random {
    //instantiate a 20 element integer array of zeros
    int[] results = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // a method to generate a random integer between 1 and 20
    private int generateRandom() {
        return (int)(Math.random() * 20 + 1);
    }

    // method to run and record the results of generateRandom() 1000 times
    private void runRandom() {
        // run the method 1000 times
        for (int i=0; i < 1000; i++) {
            // generate a random number
            int randomNumber = generateRandom();

            // store the previous value of the results array at that index
            int oldNumber = results[randomNumber - 1];

            // reset the value at that index to previous value PLUS one
            results[randomNumber - 1] = oldNumber + 1;
        }
    }

    // loop over the 20-element integer array and print results on terminal
    private void displayResults() {
        //iterate over the 20 elements of the results array
        for (int i=0; i < 20; i++){
            // the index PLUS one is the number
            int index = i + 1;
            System.out.println(index + " was returned " + results[i] + " times");
        }
    }

    // method that runs and prints out the results of the 1000 rolls
    public void runSimulation() {
        runRandom();
        displayResults();
    }

}
