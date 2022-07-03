import java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;
import java.io.*;

public class Start
{
	public static void main(String args[]) throws Exception
	{
		Bank b = new Bank();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		System.out.println("-------------------------------------------");
		System.out.println("WelCome to XYZ Bank");
		System.out.println("-------------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Customer Management");
			System.out.println("\t3. Customer-Account Management");
			System.out.println("\t4. Account Transactions");
			System.out.println("\t5. Exit");
			
			System.out.print("Your Choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Employee Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search an Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.print("Your Option: ");
					int option1 = sc.nextInt();

					switch(option1)
					{
						case 1:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert a New Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Employee Id: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = bfr.readLine();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(b.insertEmployee(e1))
							{
								System.out.println("Employee Inserted.. EmpId: "+e1.getEmpId());
							}
							else
							{
								System.out.println("Employee Not Inserted.. EmpId: "+e1.getEmpId());
							}
							System.out.println();
							break;
							
						case 2:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Employee Id: ");
							String empId2 = sc.next();
							
							Employee e2 = b.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(b.removeEmployee(e2))
								{
									System.out.println("Employee Removed.... EmpId: "+ e2.getEmpId());
								}
							}
							else
							{
								System.out.println("Employee Not Removed.... EmpId: "+ empId2);
							}
							System.out.println();
							break;
							
						case 3:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Employee Id: ");
							String empId3 = sc.next();
							
							Employee e3 = b.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found....");
								System.out.println("Employee Id: " + e3.getEmpId());
								System.out.println("Employee Name: " + e3.getName());
								System.out.println("Employee Salary: " + e3.getSalary());
							}
							else
							{
								System.out.println("Employee Not Found.... EmpId: "+ empId3);
							}
							System.out.println();
							break;
							
						case 4:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Employees");
							System.out.println("-------------------------------------------");
							
							b.showAllEmployees();
							System.out.println();
							break;
							
						case 5:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							
							break;
						
						default:
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
						
							break;
					}
					break;
					
				case 2:
				
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Customer");
					System.out.println("\t2. Remove Existing Customer");
					System.out.println("\t3. Search a Customer");
					System.out.println("\t4. Show All Customers");
					System.out.println("\t5. Go Back");
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();

					switch(option2)
					{
						case 1:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert a New Customer");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Name: ");
							String name1 = bfr.readLine();
							System.out.print("Enter Age: ");
							int age1 = sc.nextInt();
							System.out.print("Enter PhoneNumber: ");
							String phnNumber1 = sc.next();
							
							Customer c1 = new Customer(nid1, name1, phnNumber1, age1);
							
							if(b.insertCustomer(c1))
							{
								System.out.println("Customer Inserted..... NID: "+ c1.getNid());
							}
							else
							{
								System.out.println("Customer Not Inserted... NID: "+ c1.getNid());
							}
							System.out.println();							
							break;
							
						case 2:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove a Customer");
							System.out.println("-------------------------------------------");
							
						
						
						
						
							break;
							
						case 3:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search a Customer");
							System.out.println("-------------------------------------------");
							
							
							
							
							break;
							
						case 4:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Customers");
							System.out.println("-------------------------------------------");
							
							b.showAllCustomers();
							
							break;
							
						case 5:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							
							break;
						
						default:
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
						
							break;
					}
					
					
					break;
					
				case 3:
				
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer-Account Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Create an Account for a Customer");
					System.out.println("\t2. Remove an Account of a Customer");
					System.out.println("\t3. Search an Account of a Customer");
					System.out.println("\t4. Show All Accounts of a Customer");
					System.out.println("\t5. Go Back");
			
					System.out.print("Your Option: ");
					int option3 = sc.nextInt();

					switch(option3)
					{
						case 1:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert an Account");
							System.out.println("-------------------------------------------");
							
							System.out.println("There are Two Types of Accounts: ");
							System.out.println("\t 1. SavingsAccount");
							System.out.println("\t 2. FixedAccount");
							System.out.println("\t 3. Go Back");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							Account a = null;
							
							if(type == 1)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Creating a Savings Account");
								System.out.println("-------------------------------------------");
								
								System.out.print("Enter Account Number: ");
								int an1  = sc.nextInt();
								System.out.print("Enter Account Balance: ");
								double b1 = sc.nextDouble();
								System.out.print("Enter Account Interest Rate: ");
								double ir1 = sc.nextDouble();
								
								SavingsAccount sa = new SavingsAccount(an1, b1, ir1);
								a = sa;
							}
							else if(type == 2)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Creating a Fixed Account");
								System.out.println("-------------------------------------------");
								
								System.out.print("Enter Account Number: ");
								int an2  = sc.nextInt();
								System.out.print("Enter Account Balance: ");
								double b2 = sc.nextDouble();
								System.out.print("Enter Account Tenure Year: ");
								int ty2 = sc.nextInt();
								
								FixedAccount fa = new FixedAccount(an2, b2, ty2);
								a = fa;
							}
							else if(type == 3)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Going Back......");
								System.out.println("-------------------------------------------");
							}
							else
							{
								System.out.println("-------------------------------------------");
								System.out.println("Invalid Type......");
								System.out.println("-------------------------------------------");
							}
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							
							Customer c1 = b.searchCustomer(nid1);
							
							if(c1 != null)
							{
								if(c1.insertAccount(a))
								{
									System.out.println("Account " + a.getAccountNumber() + " Inserted for NID: "+ c1.getNid());
								}
								else
								{
									System.out.println("Account " + a.getAccountNumber() + " Can Not be Inserted for NID: "+ c1.getNid());
								}
							}
							else
							{
								System.out.println("Customer NOT found...");
							}
							break;
							
						case 2:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Account");
							System.out.println("-------------------------------------------");
							
						
						
						
						
							break;
							
						case 3:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Account");
							System.out.println("-------------------------------------------");
							
							
							
							
							break;
							
						case 4:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Accounts");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer NID: ");
							int nid4 = sc.nextInt();
							
							Customer c4 = b.searchCustomer(nid4);
							
							if(c4 != null)
							{
								c4.showAllAccounts();
							}
							else
							{
								System.out.println("Customer NOT found...");
							}
							
							break;
							
						case 5:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							
							break;
						
						default:
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
						
							break;
					}
					break;
					
				case 4:
				
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Account Transactions");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Deposit Money");
					System.out.println("\t2. Withdraw Money");
					System.out.println("\t3. Show Transaction History");
					System.out.println("\t4. Go Back");
					
					System.out.print("Your Option: ");
					int option4 = sc.nextInt();

					switch(option4)
					{
						case 1:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Deposit Money");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							
							Customer c1 = b.searchCustomer(nid1);
							
							if(c1 != null)
							{
								System.out.print("Enter Account Number: ");
								int an = sc.nextInt();
								
								Account a = c1.searchAccount(an);
								
								if(a != null)
								{
									System.out.println("Previous Balance: " + a.getBalance());
									System.out.print("Enter Deposit Amount: ");
									double am = sc.nextDouble();
									
									if(a.deposit(am))
									{
										System.out.println("Deposit Successful");
										String msg = am + " Deposited in Account Number: " + a.getAccountNumber();
										frwd.writeInFile(msg);
									}
									else
									{
										System.out.println("Invalid Amount");
									}
									System.out.println("Current Balance: " + a.getBalance());
								}
								else
								{
									System.out.println("Invalid Account Number...");
								}
							}
							else
							{
								System.out.println("Invalid Customer...");
							}
							
							
							break;
							
						case 2:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Withdraw Money");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer NID: ");
							int nid2 = sc.nextInt();
							
							Customer c2 = b.searchCustomer(nid2);
							
							if(c2 != null)
							{
								System.out.print("Enter Account Number: ");
								int an = sc.nextInt();
								
								Account a = c2.searchAccount(an);
								
								if(a != null)
								{
									System.out.println("Previous Balance: " + a.getBalance());
									System.out.print("Enter Withdraw Amount: ");
									double am = sc.nextDouble();
									
									if(a.withdraw(am))
									{
										System.out.println("Withdraw Successful");
										String msg = am + " Withdrawn from Account Number: " + a.getAccountNumber();
										frwd.writeInFile(msg);
									}
									else
									{
										System.out.println("Invalid Amount");
									}
									System.out.println("Current Balance: " + a.getBalance());
								}
								else
								{
									System.out.println("Invalid Account Number...");
								}
							}
							else
							{
								System.out.println("Invalid Customer...");
							}
							break;
						
						case 3:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Transactions");
							System.out.println("-------------------------------------------");
							
							
							frwd.readFromFile();							
							break;
							
						case 4:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							
							break;
						
						default:
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
						
							break;
					}
					
					break;
					
				case 5:
					System.out.println("-------------------------------------------");
					System.out.println("You have chose to Exit");
					System.out.println("-------------------------------------------");
					
					repeat = false;
					
					break;
					
				default:
					System.out.println("-------------------------------------------");
					System.out.println("Invalid Choice...............");
					System.out.println("-------------------------------------------");
					break;
			}
		}
	}
}