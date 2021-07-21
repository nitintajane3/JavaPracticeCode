package basicprogram;

public class PatternCode 
{

	public void PatternOne() 
	{
		// output 
				/*       *
					    **
					   ***
					  ****
					 *****    */
		int number = 5;
		for (int i = 0; i < number; i++) 
		{
			
			for (int k = number; k > i; k--) 
			{
				System.out.print(" ");
			}
			
			for (int j = 0; j <i+1; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
			
	
	public void PatternTwo() 
	{
		/*
		*
		**
		***
		****
		******
		**/
		int number = 5;
		for (int i = 0; i < number; i++) 
		{	
			for (int j = 0; j <i+1; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void PatternThree() 
	{
		/*
		*****
		*****
		*****
		*****
		*****
		**/
		int number = 5;
		for (int i = 0; i < number; i++) 
		{	
			for (int j = 0; j <number; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void PatternFour() 
	{
		/*     	*
		 	   ***
		 	  *****
		 	 *******
		    *********  */
		int number = 5;
		for (int i = 1; i <= number; i++) 
		{	
			for (int k = number; k >= i; k--) 
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <i*2; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void PatternFive() 
	{
		/*
		 ***********
		  *********
		   *******
		    *****
		     ***
		      *
		  */
		int number =5;
		
		for (int i = number; i>=0; i--) 
	    {	
			for (int k =i; k < number; k++) 
			{
				System.out.print(" ");
			}
		
			for (int j = 0; j <= i*2; j++) 
			{
				System.out.print("*");
			}
		System.out.println();
	}
		
	}
	
	public void PatternSix() 
	{
		int number =18;
		
		for (int i = 1; i <= number; i++) 
		{	
			for (int k = number; k >= i; k--) 
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <i*2; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = number; i>=0; i--) 
	    {	
			for (int k =i; k < number; k++) 
			{
				System.out.print(" ");
			}
		
			for (int j = 0; j <= i*2; j++) 
			{
				System.out.print("*");
			}
		System.out.println();
	}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PatternCode patternCode = new PatternCode();
		patternCode.PatternSix();
	}

}
