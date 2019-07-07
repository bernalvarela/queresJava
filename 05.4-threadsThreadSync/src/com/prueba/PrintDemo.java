package com.prueba;

class PrintDemo {
  public void printCount() {
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println(String.format("%s --- Counter --- %d", Thread.currentThread().getName(), i));
      }
    } catch (Exception e) {
      System.out.println("Thread  interrupted.");
    }
  }
}