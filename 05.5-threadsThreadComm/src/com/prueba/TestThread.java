package com.prueba;

public class TestThread {
	public static void main(String[] args) {
		Chat m = new Chat();
		new ThreadQuestion(m);
		new ThreadAnswer(m);
	}
}