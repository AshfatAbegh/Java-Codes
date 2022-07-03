package interfaces;

import java.lang.*;

public interface ITransaction
{
	boolean depositMoney(double amount);
	boolean withdrawMoney(double amount);
}