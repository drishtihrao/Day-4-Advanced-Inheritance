package com.cg.moneymoney.view;

import com.cg.bankaccount.factory.BankFactory;
import com.cg.bankaccount.factory.MMBankFactory;
import com.cg.mmbank.pojo.CurrentAcc;
import com.cg.mmbank.pojo.SavingAcc;

//the main class to test the methods defined in saving account and current account classes
public class EntryPoint {

	public static void main(String[] args) {
		BankFactory mmBankFactory = new MMBankFactory();
		SavingAcc mmSavingAcc = mmBankFactory.getNewSavingAcc(105, "Drishti", 1_00_000, true);
		CurrentAcc mmCurrentAcc = mmBankFactory.getNewCurrentAcc(105, "P", 5_00_000, 1000);
		SavingAcc mmSavingAcc2 = mmBankFactory.getNewSavingAcc(109, "B", 1_00_000, false);

		mmSavingAcc.withdraw(5000);
		System.out.println(mmSavingAcc);

		mmSavingAcc.deposit(40000);
		System.out.println(mmSavingAcc);

		mmCurrentAcc.withdraw(10_000);
		System.out.println(mmCurrentAcc);

		mmCurrentAcc.deposit(2_20_555);
		System.out.println(mmCurrentAcc);

		mmSavingAcc2.deposit(4000);
		System.out.println(mmSavingAcc);

	}

}
