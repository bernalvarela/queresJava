
package com.prueba;

public class Application {

  private final static String MESSAGE = "Id %d, Cadence %d, Speed %d, Gear %d, number of bikes %d";

  public static void main(String[] args) {

    Bicycle bike1 = new Bicycle(25, 40, 1);
    Bicycle bike2 = new Bicycle(40, 50, 4);
    Bicycle bike3 = new Bicycle(52, 65, 7);

    System.out
        .println(String.format(MESSAGE, bike1.getID(), bike1.getCadence(), bike1.getSpeed(), bike1.getGear(), Bicycle.getNumberOfBicycles()));
    System.out
        .println(String.format(MESSAGE, bike2.getID(), bike2.getCadence(), bike2.getSpeed(), bike2.getGear(), Bicycle.getNumberOfBicycles()));
    System.out
        .println(String.format(MESSAGE, bike3.getID(), bike3.getCadence(), bike3.getSpeed(), bike3.getGear(), Bicycle.getNumberOfBicycles()));

  }
}
