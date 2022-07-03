

/*
the method println() is a method of PrintStream class and it is used for printing. 
so, we need an object of PrintStream class to call this method.
out is an object of PrintStream class which is also a static attribute of the System class.

so, to call the println method we need to write out.println()
and to access out, we have to write System.out

so, System.out.println();

*/


import java.lang.*;
import java.util.Scanner;
import java.io.*;

public class ScannerDemo
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		String s1, s2, s3;
		int i;
		double d;
		char c;
		
		/*
		System.out.print("Please Enter 1st String: ");
		s1 = sc.nextLine();
		
		System.out.print("Please Enter 2nd  String: ");
		s2 = sc.next();
		
		System.out.println("Your 1st String: " + s1);
		System.out.println("Your 2nd String: " + s2);
		*/
		
		System.out.print("Enter an integer: ");
		i = sc.nextInt();
		
		System.out.print("Enter a double: ");
		d = sc.nextDouble();
		
		System.out.print("Enter a character: ");
		c = sc.next().charAt(0);
		
		System.out.println("Your interger: " + i);
		System.out.println("Your double: " + d);
		System.out.println("Your character: " + c);
		
		
		/*
		readLine() -> a method of BufferedReader class.
		so, we need an object of BufferedReader to call this method.
		now, to create an object of BufferedReader we need an object of InputStreamReader
		And, to create an object of InputStreamReader we need to use System.in
		*/
		
		System.out.print("Please Enter 3rd  String: ");
		s3 = bfr.readLine();
		
		System.out.println("Your 3rd String: " + s3);
		
	}
}