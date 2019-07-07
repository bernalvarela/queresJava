package com.prueba;

class ThreadDemo extends Thread {

  private String threadName;
  PrintDemo PD;

  ThreadDemo(String name, PrintDemo pd) {
    threadName = name;
    PD = pd;
  }

  public void run() {
    
      PD.printCount(threadName);
    System.out.println("Thread " + threadName + " exiting.");
  }

  @Override
  public void start() {
    System.out.println("Starting " + threadName);
    super.start();
  }
}
