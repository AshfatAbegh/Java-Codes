import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account();
		
		a1.setAccountNumber(11111111);
		a1.setAccountHolderName("Mahedi");
		a1.setBalance(5000.0);
		
		System.out.println("Account Number: "+a1.getAccountNumber());
		System.out.println("Account Holder Name: "+a1.getAccountHolderName());
		System.out.println("Balance: "+a1.getBalance());
		
		System.out.println("----------------------");
		
		Account a2 = new Account(11111112, "Mouri", 4500.0);
		a2.showDetails();
	}
}