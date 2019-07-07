package com.prueba;

class ThreadAnswer implements Runnable {
	Chat chat;
	String[] answers = {"Hello", "I am good, what about you?", "Great!"};

	public ThreadAnswer(Chat chat) {
		this.chat = chat;
		new Thread(this, "Answer").start();
	}

	public void run() {
		for (int i = 0; i < answers.length; i++) {
			chat.answer(answers[i]);
		}
	}
}