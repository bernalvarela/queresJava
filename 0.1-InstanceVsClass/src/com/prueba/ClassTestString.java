
package com.prueba;

// CLASS VARIABLE
public class ClassTestString {

  public static void main(String[] args) {

    String prueba = "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss";
    String prueba2 = "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss";

    Long l = 10L;
    Long l2 = 10L;
    
    Long l3 = 12345678182712L;
    Long l4 = 12345678182712L;

    int n = 1;
    MiInterfaz r = () -> System.out.println("n ="+ n);
    n = 2;
    
    MiInterfaz mi = new MiInterfaz() {
      
      @Override
      public void prueba() {
        System.out.println("m = " + n);
      }
    };
    
  }
}