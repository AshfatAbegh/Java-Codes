import java.lang.*;

public class SavingsAccount extends Account
{
	/*private int accountNumber;
	private String accountHolderName;
	private double balance;*/
	private double interestRate;
	
	public SavingsAccount()
	{
		super();
		System.out.println("SA-E");
	}
	public SavingsAccount(int accountNumber/*, String accountHolderName*/, double balance, double interestRate)
	{
		super(accountNumber/*, accountHolderName*/, balance);
		System.out.println("SA-P");
		/*this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;*/
		this.interestRate = interestRate;
	}
	
	/*public void setAccountNumber(int accountNumber){this.accountNumber = accountNumber;}
	public void setAccountHolderName(String accountHolderName){this.accountHolderName = accountHolderName;}
	public void setBalance(double balance){this.balance = balance;}*/
	public void setInterestRate(double interestRate){this.interestRate = interestRate;}
	
	
	/*public int getAccountNumber(){return accountNumber;}
	public String getAccountHolderName(){return accountHolderName;}
	public double getBalance(){return balance;}*/
	public double getInterestRate(){return interestRate;}
	
	public void showDetails()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Interest Rate: "+ interestRate);
	}
}