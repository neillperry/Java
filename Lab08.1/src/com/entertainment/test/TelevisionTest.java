/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
/*
 * Lab - Composition
 *
 * This class is the main class, i.e., where the application starts.
 *
 * It instantiates a Television and uses the new channel functionality.
 */

package com.entertainment.test;
import com.entertainment.DisplayType;
import com.entertainment.Television;


class TelevisionTest {
  
  public static void main(String[] args) {
	  Television tv = new Television("Samsung", 65, DisplayType.LED);
	  System.out.println(tv);
	  
	  tv.changeChannel("HBO");
	  tv.getCurrentChannel();
	  System.out.println(tv);
  }
}