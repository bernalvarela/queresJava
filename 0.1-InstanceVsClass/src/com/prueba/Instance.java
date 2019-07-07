
package com.prueba;

// INSTANCE VARIABLE
public class Instance {

  public static void main(String[] args) {

    ProductInstace prod1 = new ProductInstace();
    prod1.barcode = 123456;

    ProductInstace prod2 = new ProductInstace();
    prod2.barcode = 987654;

    System.out.println(prod1.barcode);
    System.out.println(prod2.barcode);
  }
}


class ProductInstace {
  public int barcode;

  public int getBarcode() {
    return barcode;
  }

  public void setBarcode(int value) {
    barcode = value;
  }
}
