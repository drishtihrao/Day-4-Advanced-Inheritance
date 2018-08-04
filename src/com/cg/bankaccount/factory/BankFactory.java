package com.cg.bankaccount.factory;

import com.cg.mmbank.pojo.CurrentAcc;
import com.cg.mmbank.pojo.SavingAcc;

//class for defining the necessary methods of creating a new savings and current account
public abstract class BankFactory {
	public abstract SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);

	public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);
}
