package com.prueba;

public class InsufficientFundsException extends Exception {

    private static final long serialVersionUID = 9028742320415411454L;
    private double amount;

    public InsufficientFundsException(double amount) {
	this.amount = amount;
    }

    public double getAmount() {
	return amount;
    }
}