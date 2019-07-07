
package com.prueba;

import java.io.FileOutputStream;
import java.io.IOException;

public class Application {

  private static final String PRUEBA = "PRUEBA";

  public static void main(String args[]) {
    try (FileOutputStream fileOut = new FileOutputStream("/tmp/prueba");) {
      fileOut.write(PRUEBA.getBytes());
      System.out.printf(String.format("Writed %s to file", PRUEBA));
    } catch (IOException i) {
      i.printStackTrace();
    }
  }
}
