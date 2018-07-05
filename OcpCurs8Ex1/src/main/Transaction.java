package main;

import java.time.LocalDateTime;

public class Transaction {

	private double amount;
	private LocalDateTime creationDate;
	
	public Transaction(double amount) {
		this.amount = amount;
		this.creationDate = LocalDateTime.now();
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Transaction [amount=" + amount + ", creationDate=" + creationDate + "]";
	}
	
}
