
package com.prueba;

public class BreakUnlabeled {

  public static void main(String[] args) {
    // for loop
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        // using break statement
        break;// it will end the loop
      }
      System.out.println(i);
    }
  }
}