package com.prueba;

public class ThreadQuestion implements Runnable {

	Chat chat;
	String[] questions = {"Hi", "How are you ?", "I am also doing fine!"};

	public ThreadQuestion(Chat chat) {
		this.chat = chat;
		new Thread(this, "Question").start();
	}

	public void run() {
		for (int i = 0; i < questions.length; i++) {
			chat.question(questions[i]);
		}
	}
}
