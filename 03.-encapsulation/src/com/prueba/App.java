package com.prueba;

public class App {

  public static void main(String args[]) {
    EncapsulatedPerson encap = new EncapsulatedPerson();
    encap.setName("James");
    encap.setAge(20);
    encap.setIdNum("12343ms");

    System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
  }
}