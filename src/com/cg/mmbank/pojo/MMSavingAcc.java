package com.cg.mmbank.pojo;

//this class defines function withdraw to override the method defined in parent class SavingAcc
public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL = 10_000;

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}

	// overriding the withdraw function
	// for salary account the minimum balance is Rs.0 and for a non-salary account is Rs 10000
	//for a salary account, the minimum balance required is zero
	//for non-salary account, a required minimum balance has to be maintained
	public void withdraw(float amount) {
		if (isSalaried()) {
			if ((getAccBal() - amount) >= 0) {
				setAccBal(getAccBal() - amount);
			} else {
				System.out.println("Transaction failed");
			}
		} else {
			if ((getAccBal() - amount) >= getMinBal()) {
				setAccBal(getAccBal() - amount);
			} else {
				System.out.println("Transaction failed");
			}
		}
	}

	@Override
	public String toString() {
		return "MMSavingAcc =" + super.toString() + ".";
	}

}