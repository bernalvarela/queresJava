
package com.prueba;

// CLASS VARIABLE
public class Class {

  public static void main(String[] args) {
    ProductClass prod1 = new ProductClass();
    prod1.setBarcode(123456);
    ProductClass prod2 = new ProductClass();
    prod2.setBarcode(987654);

    System.out.println(prod1.getBarcode());
    System.out.println(prod2.getBarcode());
    
    String prueba = "";
    switch (prueba) {
      case prueba:
        System.out.println("hola");
        break;

      default:
        break;
    }
  }
}

class ProductClass {

  public static int barcode;

  public int getBarcode() {
    return barcode;
  }

  public void setBarcode(int value) {
    barcode = value;
  }
}
