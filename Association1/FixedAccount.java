import java.lang.*;

public class FixedAccount extends Account
{
	private int tenureYear;
	
	public FixedAccount()
	{
		super();
		System.out.println("FA-E");
	}
	public FixedAccount(int accountNumber/*, String accountHolderName*/, double balance, int tenureYear)
	{
		super(accountNumber/*, accountHolderName*/, balance);
		System.out.println("FA-P");
		this.tenureYear = tenureYear;
	}
	
	public void setTenureYear(int tenureYear){this.tenureYear = tenureYear;}
	public int getTenureYear(){return tenureYear;}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Tenure Year: "+ tenureYear);
	}
}