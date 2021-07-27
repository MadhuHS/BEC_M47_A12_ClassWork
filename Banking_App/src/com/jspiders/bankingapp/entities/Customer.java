package com.jspiders.bankingapp.entities;

public class Customer
{
	int accountID;
	String customerName;
	String email;
	String address;
    String pancard;
    
    public Customer(int a,String b,String c,String d,String e)
    {
    	accountID = a;
    	customerName = b;
    	email = c;
    	address = d;
    	pancard = e;
    }
    
    public void CustomerDetails()
    {
    	System.out.println(accountID);
    	System.out.println(email);
    	System.out.println(customerName);
    	System.out.println(address);
    	System.out.println(pancard);
    }
}
