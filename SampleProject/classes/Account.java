package classes;


import java.lang.*;
import interfaces.ITransactions;


public abstract class Account implements ITransactions
{	
	protected int accountNumber;
    //protected String accountHolderName;
	protected double balance;
	
	public Account()
	{
		System.out.println("Empty-Account");
	}
	public Account(int accountNumber/*, String accountHolderName*/, double balance)
	{
		System.out.println("Parameterized-Account");
		this.accountNumber = accountNumber;
		//this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
		
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
/*	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;	
	}*/
	public void setBalance(double balance)
	{
		this.balance = balance; 
	}
	
	public int getAccountNumber()
	{
		return accountNumber; 
	}
	/*public String getAccountHolderName()
	{
		return accountHolderName; 
	}*/
	public double getBalance()
	{ 
		return balance;
	}
	
	public abstract void showDetails();
	/*{
		System.out.println("Account Number: "+ accountNumber);
		//System.out.println("Account Holder Name: "+ accountHolderName);
		System.out.println("Balance: "+ balance);
	}*/
	
	public boolean deposit(double amount)
	{
		boolean flag = false;
		if(amount>0)
		{
			balance = balance + amount;
			flag = true;
		}
		return flag;
	}
	
	public boolean withdraw(double amount)
	{
		if(amount>0 && amount<= balance)
		{
			balance = balance - amount;
			return true;
		}
		else
		{
			return false;
		}
	}
}

