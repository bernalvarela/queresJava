package com.prueba;

public class App {

  public static void main(String[] args) {
    /* Following is not allowed and would raise error */
    Employee e = new Employee("George W.", "Houston, TX", 43);
    System.out.println("\n Call mailCheck using Employee reference--");
    e.mailCheck();
  }
}