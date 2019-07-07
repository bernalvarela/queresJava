package com.prueba;

public class ThreadDemo2 extends Thread {

	private Object lock1;
	private Object lock2;

	ThreadDemo2(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	public void run() {
		synchronized (lock1) {
			System.out.println("Thread 2: Holding lock 1...");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			System.out.println("Thread 2: Waiting for lock 2...");

			synchronized (lock2) {
				System.out.println("Thread 2: Holding lock 1 & 2...");
			}
		}
	}

}