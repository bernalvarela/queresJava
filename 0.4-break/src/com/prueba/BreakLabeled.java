
package com.prueba;

// Java Program to demonstrate the use of continue statement
// inside the for loop.
public class BreakLabeled {

  public static void main(String[] args) {
    aa: for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2) {
          // using continue statement with label
          break aa;
        }
        System.out.println(i + " " + j);
      }
    }
  }
}
