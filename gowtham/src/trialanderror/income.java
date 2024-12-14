package trialanderror;
import java.util.*;
public class income {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Enter your Estimated Monthly Income:");
				int incomes = sc.nextInt();
				System.out.println("Enter your Monthly Expenses: ");
				int expenses = sc.nextInt();
				int balance = incomes - expenses;
				System.out.println("Balance income is:"+balance);
			}
			catch(Exception e)
			{
				System.out.println("Invalid Input..Please Enter Numeric Values");
			}
	}
}


