import java.util.Scanner;


public class fact {

	public static void main(String[] args) {
	
		  
		   
		      int t, n, fact = 1;
		 
		      System.out.println("Enter an integer to calculate it's factorial");
		      Scanner in = new Scanner(System.in);
		 
		      t = in.nextInt();
		 
		      if ( t < 0 )
		         System.out.println("Number should be non-negative.");
		      else
		      {
		         for ( n = 1 ; n <= t ; n++ )
		            fact = fact*c;
		 
		         System.out.println("Factorial of "+t+" is = "+fact);
		      }
		   }
		

	}


