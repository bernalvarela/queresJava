
package com.prueba;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ContinueDoWhile {

  public static void main(String[] args) {
    Random r = new Random();
    Set<Integer> aSet = new HashSet<Integer>();
    int anInt;
    do {
      anInt = r.nextInt(10);
      if (anInt % 2 == 0) {
        continue;
      }
      System.out.println(anInt);
    } while (aSet.add(anInt));
    System.out.println(aSet);
  }
}
