package com.prueba;

public class TestThread {

  public static void main(String args[]) {
    ThreadDemo R1 = new ThreadDemo("Thread-1");
    R1.start();

    ThreadDemo R2 = new ThreadDemo("Thread-2");
    R2.start();
  }
}
