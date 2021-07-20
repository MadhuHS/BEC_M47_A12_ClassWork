package com.jspiders.bankingapp.entities;

public class Account 
{
	long accountID;//non-static
	String account_Type;//non-static
	double accountBalance; //non-static
	String openDate;//non-static
	
	static String bankName;//static
	
	public static void showBankname()//static
	{
		System.out.println(bankName);
	}
	
	public void showAccountBalance()//non-static
	{
		System.out.println(accountBalance);
	}
	
	public void showAccountDetails()//non-static
	{
		System.out.println(accountID);
		System.out.println(account_Type);
		System.out.println(accountBalance);
		System.out.println(openDate);
		System.out.println(bankName);
	}
}
