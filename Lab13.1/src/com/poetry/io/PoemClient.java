/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.poetry.io;

import java.io.PrintWriter;
import java.util.stream.Stream;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class PoemClient {

  /**
   * Uncomment these after you've completed their implementations.
   */
  public static void main(String[] args) {
    readPoem();
    writePoem();
  }
  
  /**
   * TASK: read all the lines in file 'famous-poem.txt'.
   * Avoid the temptation to open the file in Eclipse first.
   * You'll see the poem once you get your code working(!)
   * 
   * This file is in the project root directory, which is the current / working 
   * directory at runtime.  Therefore, the path to the file is just the filename.
   * 
   * Use a BufferedReader wrapped around a FileReader.
   * Use a try-with-resources to initialize the stream and auto-close it.
   */




  private static void readPoem() {

    File file = new File("C:\\StudentWork\\IntroJava\\workspace\\Lab13.1\\famous-poem.txt");

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      // here is an easy way to dump out all the lines
      // you may not have worked with Java 8 streams, so we give this to you
      Stream<String> lines = reader.lines();
      lines.forEach(System.out::println);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  /**
   * TASK: write a poem of your own creation to file 'my-poem.txt'.
   * 
   * Use a PrintWriter wrapped around a FileWriter.
   * Use a try-with-resources to initialize the stream and auto-close it.
   */
  private static void writePoem() {
    File file = new File("C:\\StudentWork\\IntroJava\\workspace\\Lab13.1\\lincoln.txt");

    try (PrintWriter out = new PrintWriter(new FileWriter(file, true))) {
      out.println("O Captain! my captain! our fearful trip is done,");
      out.println("The ship has weathered ever rack, the prize we sought is won,");
      out.println("The port is near, the bells I hear, the people all exulting,");
      out.println("While follow eyes the steady keel, the vessel grim and daring;");
    }
    catch (IOException e) {
      e.printStackTrace();
    }

  }
}