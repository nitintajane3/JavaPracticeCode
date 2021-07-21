package basicprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PracticePrograms 
{
	public void reverseString() 
	{
		
	String teString = "tajanesangamner";
//		char a[] = teString.toCharArray(); 
//		for(int i=teString.length()-1;i>=0;i--)
//		{
//			System.out.print(a[i]);
//		}
		
		// using string builder
		
		/*StringBuilder builder = new StringBuilder(teString);
		builder = builder.reverse();
		System.out.println(builder);*/
	
		// using charat function
	
	
		String original = "sdfsdfhsdjask", reverse = "";
        System.out.println("Enter the string to be reversed");
      
        int length = original.length();
        for(int i=length-1; i>=0; i--) {
            reverse = reverse + original.charAt(i);   //used inbuilt method charAt() to reverse the string
        }
        System.out.println(reverse);
    
	}
	
	public void swapTwoNumberusingThirdVariable() 
	{
		int a = 23;
		int b= 45;
		System.out.println("first value is : " + a + " second value is : " + b);
		
		int temp =0;
		
		temp = a;
		a= b;
		b=temp;
		
		System.out.println("after swap first value is : " + a + " second value is : " + b);
		
		// swap wihout using third variable 
		
		/* x = x + y;
	      y = x - y;
	      x = x - y;*/
	}

	public void splitFunctionforReverseString() 
	{
		String string = "tajanesangamner";
		String[] a = string.split("");
		for (int i = a.length-1; i >=0 ; i--) 
		{
			System.out.print(a[i]);
		}
		
	}
	
	public void iterateHashMappedUsingFor() 
	{
	
		HashMap<Integer, String> test = new HashMap<Integer, String>();
		test.put(1, "meeting");
		test.put(2, "tamplo");
		test.put(3, "hashcode");
		test.put(4, "testing");
		test.put(5, "automation");
		
		/* for (Map.Entry me : test.entrySet()) 
		  {
	          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
	        }*/

		  
		  //  using iterator 
		  
		  Iterator iterator = test.entrySet().iterator();
		  while (iterator.hasNext()) 
		  {
			Map.Entry object = (Map.Entry) iterator.next();
			System.out.println(object.getValue());
			
		}
	}
	
	public void checkHowManytimeSameWordPresentinSentence() 
	{
		//Write a Java Program to count the number of words in a string using HashMap
		
		String str = "This this is is done by Saket Saket";
        String[] split = str.split(" ");
         
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) 
        {
        	
            if (map.containsKey(split[i])) 
            {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else 
            {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }

	
	public void CountNumberOfWordsInStringMain() 
	{
		String teString = "nitin tajane stay in   hometest";
		/*String[] test  = teString.split(" ");
		System.out.println("number word : " + test.length);*/
		
		char[] charaters = teString.toCharArray();
		
		System.out.println("number of characters : " + charaters.length);
		int count = 1;
		for (int i = 0; i < charaters.length-1; i++) 
		{
			
			if((charaters[i] == ' ') && (charaters[i+1] != ' '))
			{
				count++;
			} 
			
		}
		System.out.println("number of words : " + count);	
	}
	
	public void duplicateWordinStrng() 
	{
		String teString = "nitin tajane stay in nitin hometest stay in nitin";
		String[] test  = teString.split(" ");
		System.out.println("number word : " + test.length);
		for(int i=0;i<test.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<test.length;j++)
			{
				if (test[i].equalsIgnoreCase(test[j])) 
				{
					//System.out.println("print the duplicate word : " + test[i]);
					count++;
					test[j] = "0";   //Set test[j] to 0 to avoid printing visited word   
				}								
			}
					
			 //Displays the duplicate word if count is greater than 1  
			if (count>1 && test[i] != "0") 
			{
				System.out.println("du[plicate : " + test[i]);
				System.out.println("print the count " + count + " the word is : " + test[i]);
			}
		}
	}
	
	public void palindromeOrNot() 
	{
	
		String given = "99nitin99";
		char[] array = given.toCharArray();
		String reversecontainer = "";
		
		for (int i = array.length-1; i >=0; i--) 
		{
			reversecontainer = reversecontainer + array[i];
		}
		
		System.out.println("print the reverse string : " + reversecontainer);
		
		if (reversecontainer.equalsIgnoreCase(given)) 
		{
			System.out.println("given string is palindrome");
		} 
	}
	
	public void findSecondHighestNumberFRomarray() 
	{
	
		/*int[] test = {10,40,34,67,87,12,05,45,23,88,14,03};
		int sizeofarray = test.length;
		System.out.println(sizeofarray);
		
		Arrays.sort(test);
		System.out.println("second largest number is : " + test[sizeofarray-2]);
		int temp = 0;
		for (int i = 0; i < test.length; i++) 
		{
			
			for (int j = i+1; j < test.length; j++) 
			{
				if (test[i] > test[j]) 
				{
					temp = test[i];
					test[i] = test[j];
					test[j] =  temp;
				}
			}
		}
		
		System.out.println("find the second largest number : " + test[sizeofarray-2]);*/
		
	// find second higest number using single for loop
		int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 96, 89 };
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);
	}
	
	public void checkArmstrongNumber() 
	{
		int c=0,a,temp;  
		   int n=1635;//It is the number to check Armstrong  
		   temp=n;  
		   while(n>0)  
		   {  
				   a=n%10;  
				   c=c+(a*a*a*a);  
				   n=n/10; 
		    }  
		   
		   if(temp==c)  
		    System.out.println("armstrong number");   
		    else 
		        System.out.println("Not armstrong number");   
		   
	}
	
	public void RemveWhiteSpaceWithoutReplace() 
	{
		String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
		  
        char[] chars = str1.toCharArray();
  
        StringBuffer sb = new StringBuffer();
  
        for (int i = 0; i<chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        } 
        System.out.println(sb);
	}
	
	public void reverseTheEachWordFromSentence() 
	{
		
		String string = "nitin tajane sangamner ahmednagar";
		String concatefinal = "";
		String[] reverse = string.split(" ");
		/*int lengthofeach = reverse.length;
		
		for (int i = 0; i < lengthofeach; i++) 
		{
			for (int j =reverse[i].length()-1 ; j >= 0; j--) 
			{
				concatefinal = concatefinal + reverse[i].charAt(j);
			}
			
			concatefinal = concatefinal + " ";
		}
		
		System.out.println("final string as : "  + concatefinal);*/
		
	// second method to reverse each word
		
		for (String string2 : reverse) 
		{
		   StringBuilder builder = new StringBuilder(string2);
		   builder.reverse();
		   concatefinal += builder.toString() + " ";
		}
		
		System.out.println("final string as : " + concatefinal);
	}

	public void checkHowManyTimeSingleCharacterPresent()
	{
		String teString = "nitin";
		
		int count = 0;
		for (int i = 0; i < teString.length(); i++) 
		{
			if (teString.charAt(i)=='n') 
			{
				System.out.println("");
				count++;
			}
		}
		
		System.out.println("count is as : " + count);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PracticePrograms practicePrograms = new PracticePrograms();
		practicePrograms.checkHowManyTimeSingleCharacterPresent();
		
		
	}

}
