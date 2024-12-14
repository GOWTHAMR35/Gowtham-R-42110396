package trialanderror;
import java.util.*;
public class student1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        int[] marks = new int[numSubjects];
        for (int i = 0; i <numSubjects; i++) 
        {
            System.out.print("Enter the mark");
            marks[i] = sc.nextInt();
        }
        while(true)
        {
        	try
        	{
        		int index = sc.nextInt();
                System.out.println(marks[index]);
                break;
        	}
        	catch(Exception e )
        	{
        		System.out.println("Enter Valid index");
        	}
        }  		
	}
}

