package com.cg.mmbank.pojo;

//bank account is the parent class which gets inherited by savings account and current acount classes
public abstract class BankAccount {
	private int accNo;
	private String accNm;
	private float accBal;

	abstract void withdraw(float amount);

	// defining a constructor to input the values of account number, account balance
	// and name of the account
	public BankAccount(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	// defining a method to calculate balance after deposit
	public void deposit(float amount) {
		this.accBal += amount;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return " BankAcc with accNo = " + accNo + ", accNm = " + accNm + ", accBal = " + accBal + ".";
	}

}
