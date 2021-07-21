package basicprogram;

import java.util.Scanner;

public class ArraysProgram 
{

	public void findGreatherNumber() 
	{
		int[] a = {10,30,64,23,12,34,54,34,3};
		
		int max =a[0];
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			
			if (a[i] < min) 
			{
				min = a[i];
			}
		}
		
		System.out.println("min number is : " + min +  "  max number is : " + max);
	}
	
	public void findGreatherNumberUsingTwoforLoop() 
	{
		int[] a = {10,30,44,23,12,34,54,34,3};
		
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i] > a[j]) 
				{
					temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		System.out.println(temp);
	}
	
	public void findSizeWithoutSizeFunction() 
	{
	
		String string = "dsfsdiyrfdjkfs";
		int i=0;
		for(char a : string.toCharArray())
		{
			i++;
		}
		System.out.println("total  number character into string is  :  " + i);
	}
	
	public void FindPrimeAndNonPrimeNumbers() 
	{
		int i,j;
		for (i = 2; i < 20; i++) 
		{
			int count =0;
			for (j = 2; j < i/2; j++) 
			{
				if (i%j==0) 
				{
					count++;
					break;
				}
				
			}
			
			if (count==0) 
			{
			System.out.println("this number is prime " + i);
			} else 
			{
				System.out.println("this number is not prime " + i);
			}
		}

	}
	
	public void EvenOddNumber() 
	{
		Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();
		for (int i = 0; i <= num; i++) 
		{
			if (i%2==0) 
			{
				System.out.println("number is even  " + i);
			}else {
				System.out.println("number is odd  " + i);
			}
		}
	}
	
	public void apendFunctionforIsDigitCheck() 
	{
		String input = "adcch786765jgjhg123hjjgj";
    	char a[] = input.toCharArray();
    	StringBuilder builder = new StringBuilder();
    	for(char name : a)
    	{	
    		if (Character.isDigit(name)) 
    		{
				builder.append(name);
			}	
    	}
    	String string = builder.toString();
    	System.out.println(string);
    	
    	/*String input = "adcchjgjhg123hjjgj";
    	StringBuilder builder = new StringBuilder();
    	
    	for(int i=0;i<input.length();i++)
    	{
    		char c = input.charAt(i);
    		if (Character.isDigit(c)) 
    		{
				builder.append(c);
			}
    	}
    	System.out.println(builder.toString());
*/
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArraysProgram arraysProgram = new ArraysProgram();
		arraysProgram.apendFunctionforIsDigitCheck();
	}

}
