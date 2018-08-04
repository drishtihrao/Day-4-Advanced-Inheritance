package com.cg.mmbank.pojo;

//Class CurrentAcc inherits variables and methods from class BankAcc
//current account has a credit limit which is not present in savings account
public abstract class CurrentAcc extends BankAccount {
	private final float creditLimit;

	public abstract void withdraw(float amount);

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	@Override
	public String toString() {
		return "CurrentAcc creditLimit =" + creditLimit + "," + super.toString() + ".";
	}
}