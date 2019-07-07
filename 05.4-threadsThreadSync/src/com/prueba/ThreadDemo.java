package com.prueba;

class ThreadDemo extends Thread {

	PrintDemo PD;

	ThreadDemo(String name, PrintDemo pd) {
		super.setName(name);
		PD = pd;
	}

	public void run() {
		synchronized (PD) {
			PD.printCount();
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " exiting.");
	}

	@Override
	public void start() {
		System.out.println("Starting " + Thread.currentThread().getName());
		super.start();
	}
}