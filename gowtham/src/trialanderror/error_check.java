package trialanderror;
import java.util.*;
public class error_check {
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			int price = 0, items=0, cost=0;
			try {
			price = in.nextInt();
			items = in.nextInt();
			cost = price/items;
			System.out.println("The Cost of product:" +cost);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Enter the Valid Count. "+e);
			}
		}
	}

