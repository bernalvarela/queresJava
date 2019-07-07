package com.prueba;

public class App {

  public static void main(String args[]) {
    EncapsulatedPerson encap = EncapsulatedPerson.builder().name("James").age(20).idNum("1234ms").build();

    System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
  }
}