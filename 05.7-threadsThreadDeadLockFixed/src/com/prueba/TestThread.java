package com.prueba;

public class TestThread {
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String args[]) {
		ThreadDemo1 T1 = new ThreadDemo1(lock1, lock2);
		ThreadDemo2 T2 = new ThreadDemo2(lock1, lock2);
		T1.start();
		T2.start();
	}
}