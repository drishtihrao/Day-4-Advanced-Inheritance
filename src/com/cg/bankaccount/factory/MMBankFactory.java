package com.cg.bankaccount.factory;

import com.cg.mmbank.pojo.MMCurrentAcc;
import com.cg.mmbank.pojo.MMSavingAcc;

//this class implements the methods defined in parent class BankFactory
public class MMBankFactory extends BankFactory{
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm,float accBal, boolean isSalaried) {
		MMSavingAcc savingAcc = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return savingAcc;
	}
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm,float accBal,float creditLimit) {
		MMCurrentAcc currentAcc = new MMCurrentAcc(accNo, accNm, accBal,creditLimit);
		return currentAcc;
	}
}
