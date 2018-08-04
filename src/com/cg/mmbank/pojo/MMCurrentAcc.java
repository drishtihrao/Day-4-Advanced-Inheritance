package com.cg.mmbank.pojo;

//this class overrides the methods defined in Parent class CurrentAcc
public class MMCurrentAcc extends CurrentAcc {
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	//for a current account, a person can withdraw a maximum amount of balance with credit limit
	public void withdraw(float amount) {
		if (((getAccBal() + getCreditLimit()) - amount) >= 0) {
			setAccBal(getAccBal() + getCreditLimit() - amount);
		} else 
			System.out.println("Transaction failed");
	}

	@Override
	public String toString() {
		return "MMCurrentAcc =" + super.toString() + ".";
	}
}
