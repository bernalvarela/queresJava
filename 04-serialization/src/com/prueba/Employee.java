package com.prueba;

public class Employee implements java.io.Serializable {

  private static final long serialVersionUID = -3938472005395423823L;

  public String name;
  public String address;
  public transient int SSN;
  public int number;

  public void mailCheck() {
    System.out.println("Mailing a check to " + name + " " + address);
  }
}
