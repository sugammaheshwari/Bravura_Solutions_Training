package day3_CustumException;

import java.util.Scanner;

public class mainclass {

	public static void main(String[] args)
	{
		System.out.println("enter the no of ticekts to buy");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();input.close();
		TicketBooker tb1=null;
		
		try {
			tb1=new TicketBooker(n);
		}
		catch(Custum e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
