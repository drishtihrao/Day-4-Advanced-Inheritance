package com.cg.mmbank.pojo;

//Class SavingAcc inherits variables and methods from class BankAcc

public abstract class SavingAcc extends BankAccount {
	private static final float MINBAL = 10_000;
	public abstract void withdraw(float amount);
	private boolean isSalaried;
	
	public SavingAcc(int accNo, String accNm,float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.setIsSalaried(isSalaried);
	}
	
	//defining a boolean method to decide if the account is a salary account or not
	public boolean isSalaried() {
		return isSalaried;
	}
	
	public void setIsSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	
	public static float getMinBal() {
		return MINBAL;
	}
}

