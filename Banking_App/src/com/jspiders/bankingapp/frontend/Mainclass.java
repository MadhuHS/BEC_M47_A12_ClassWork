package com.jspiders.bankingapp.frontend;

import com.jspiders.bankingapp.entities.Customer;

public class Mainclass
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer(123, "Arjun", "Arjun@gmail.com", "Bangalore", "A78B091");
		c1.CustomerDetails();
		
		Customer c2 = new Customer(8102, "Krishna", "Krishna@gmail.com", "Delhi", "B0DPM76");
		c2.CustomerDetails();
	}
}
