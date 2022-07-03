import java.util.Scanner;

public class Account{
	int balance;
	int previousTransaction;
	String customerName;
	String  customerID;
	Account( String cname , String cid)
	{
		customerName=cname;
		customerID=cid;
	}
	 void deposit(int amount)
	{
		if (amount !=0)
		{
			balance=balance+amount;
			previousTransaction=amount;
		}
	}
	void withdraw(int amount)
	
	{
		if (amount !=0)
		{
			balance=balance-amount;
			previousTransaction=  -amount;
		}
	}
	
	 void getPreviousTransaction()
	{
		if (previousTransaction>0)
		{
			System.out.println("Deposited:"+previousTransaction);
		}
		else if (previousTransaction<0)
		{
			System.out.println("withdrawn:"+ Math.abs (previousTransaction));
		}
		else
		{
			System.out.println("No transaction occurred");
		}
	}
     void calculateinterest(int years)
	{
		 double interestRate=0.185;
		 double newbalance=(balance*interestRate*years)+balance;
		 
		 
		 System.out.println("The current interest rate is "+(100*interestRate)+"%");
		 
		 System.out.println("After" + years + "years, your balance will be: " + newbalance);
	
	}
	void showMenu()
	{
		char option='\0';
		Scanner scanner=new Scanner(System.in);
	    System.out.println("----------------------------NCC BANK LDT----------------------------");
	    System.out.println("Welcome,"+ customerName +"!");
		System.out.println("Your ID is:" + customerID);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		 
		System.out.println("A. Check your Balance");
		System.out.println("B. Make a Deposit");
		System.out.println("C.Make a withdrawl");
		System.out.println("D.View previous transaction");
		System.out.println("E.Calculate interest");
		System.out.println("F.EXIT");
		
		do 
		{
		System.out.println();
		System.out.println("Enter an option:");
		char option1  = scanner.next().charAt(0);
		option=Character.toUpperCase(option1);
		System.out.println();
		
		
		switch (option)
		{
			case 'A':
			
			System.out.println("Balance=$" + balance);
			
			System.out.println();
			break ;
			
			case'B':
			System.out.println("Enter an amount to deposit");
			int amount=scanner .nextInt();
			deposit(amount);
			System.out.println();
			break;
			
			case 'C':
			System.out.println("Enter an amount to withdraw");
		        int amount2=scanner.nextInt();
		        withdraw(amount2);
		        System.out.println();
		        break;
		
		case'D':
		
		
	
		getPreviousTransaction();
		System.out.println();
		break;
		
		case'E':
		System.out.println("Enter how many years of accrued interest:");
	     int  years=scanner.nextInt();
	     calculateinterest(years);
	      break;
		  
	      case'F':
	         
		
		break;
		
		default:
		System.out.println("ERROR: invalid option.Please enter A,B,C,D,E,F");
		break;
		}
		
		}
		while (option!='F');
		System.out.println("----------------THANK YOU---------------------");
	}
}