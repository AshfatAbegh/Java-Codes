package classes;

import java.lang.*;
import interfaces.AccountOperations;

public class Customer implements AccountOperations
{
	private int nid;
	private String name;
	private String phnNumber;
	private int age;
	private Account accounts[] = new Account[10];

	public Customer()
	{
		System.out.println("E-Customer");
		/*savingsAccounts = new SavingsAccount[10];
		fixedAccounts = new FixedAccount[10];*/
	}
	public Customer(int nid, String name, String phnNumber, int age)
	{
		//this();
		System.out.println("P-Customer");
		this.nid = nid;
		this.name = name;
		this.phnNumber = phnNumber;
		this.age = age;
	}
	
	public void setNid(int nid){this.nid = nid;}
	public void setName(String name){this.name = name;}
	public void setPhnNumber(String phnNumber){this.phnNumber = phnNumber;}
	public void setAge(int age){this.age = age;}

	public int getNid(){return nid;}
	public String getName(){return name;}
	public String getPhnNumber(){return phnNumber;}
	public int getAge(){return age;}
	
	public void showDetails()
	{
		System.out.println("Customer NID: " + nid);
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Phone Number: " + phnNumber);
		System.out.println("Customer Age: " + age);
	}
	
	public boolean insertAccount(Account a)
	{
		boolean flag = false;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeAccount(Account a)
	{
		boolean flag = false;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllAccounts()
	{
		System.out.println("///////////////////////////////\n");
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				accounts[i].showDetails();
				System.out.println();
			}
		}
	}
	
	public Account searchAccount(int accountNumber)
	{
		Account a = null;
		for(int i =0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				if(accounts[i].getAccountNumber() == accountNumber)
				{
					a = accounts[i];
					break;
				}
			}
		}
		return a;
	}
}