package basicprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewInterviewProgram 

{
	public void findUniqueCharacterFromstring() 
	{
		// code for finding the unique character from  string 
		String teString = "nitintajanes";
		
		String[] test  = teString.split("");
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
			if (count==1 && test[i] != "0") 
			{
				System.out.println("du[plicate : " + test[i]);
				System.out.println("print the count " + count + " the word is : " + test[i]);
			}
		}
	}

	public void writeProgramFindDuplicateNumber() 
	{
		//Write a program to print unique value from array

		int[] array = {5,3,6,8,1,5,3,9};
		
		Set<Object> tests = new HashSet<>();
		
		for (Integer object : array) 
		{
			tests.add(object);
		}
		
		System.out.println(tests);
		
	}
	
	public void findDuplicateNumberInNumberArray() 
	{
		int[] array = {3,5,3,6,8,5,1,5,3,9};
		
		int legthofarray = array.length;
		
		for (int i = 0; i < legthofarray; i++) 
		{	
			
			for (int j = i+1; j < legthofarray; j++) 
			{
				if (array[i]==array[j] ) 
				{
					System.out.println("duplicate number present in array : " + array[i]);
					
				}				
			}
			
			
			
		}
		
		// using set we can find it 
		
		/*Set<Integer> set = new HashSet<>();
		
		for (int name : array) 
		{
		     if (set.add(name) == false) 
		     {
		        System.out.println("number which we found duplicate : " + name);
		     }
		}*/
	}
	
	public void readDataFromInputConsole() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the input : " );
		String inputtext = scanner.next();
		System.out.println("output as : "  + inputtext);
		scanner.close();
	}
	
	public void readTheFileAndGetData() throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\Admin\\RestAssuredAPITest\\JavaPracticeProject\\src\\basicprogram\\testfile.txt");
	
		Scanner scanner = new Scanner(file);
		scanner.nextLine();
		scanner.nextLine();
		String firstline = scanner.nextLine();
		System.out.println(firstline);
		
		// here reading all data from text file
		/*while(scanner.hasNextLine()) 
		{			
			String teString = scanner.nextLine();
			System.out.println("print the data :" + teString);
		}
		*/
		scanner.close();
	}
	
	public void removeDuplicateFromListUsingJava8Function() 
	{
		
		ArrayList<String> numbersList  = new ArrayList<>(Arrays.asList("sangamner","nitin","ttajane","nitin"));
	  
	    List<String> listWithoutDuplicates = numbersList.stream()
	            .distinct()
	            .collect(Collectors.toList());
	  
	  System.out.println(listWithoutDuplicates);
	  
	  /*ArrayList<Integer> numbersList  = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,7,6,5,3));
	  
	    List<Integer> listWithoutDuplicates = numbersList.stream()
	            .distinct()
	            .collect(Collectors.toList());
	  
	  System.out.println(listWithoutDuplicates);*/
	
// using set removed duplicate one and keep only unique
	
	  /* ArrayList<Integer> numbersList 
	    = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	  
	Set<Integer> setWithoutDuplicates = numbersList.stream()
	            .collect(Collectors.toSet());
	  
	System.out.println(setWithoutDuplicates);*/
	  
	}
	
	public void findDuplicateUsingStreamFunction() 
	{
		// what is use of lambda function 
		//A function that can be created without belonging to any class
		//Enable to treat functionality as a method argument, or code as data.
		//A lambda expression can be passed around as if it was an object and executed on demand.
		
		ArrayList<Integer> numbersList  = new ArrayList<>(Arrays.asList(3,5,2,4,3,6,7,8,9,5,4));
		  
	    Set<Integer> listWithoutDuplicates = numbersList.stream()
	    		.filter(i -> Collections.frequency(numbersList, i) >1)
                .collect(Collectors.toSet());
	    
	    System.out.println(listWithoutDuplicates);
	    
// find duplicate from input string 
	    
	    ArrayList<String> stringList  = new ArrayList<>(Arrays.asList("nitin","tajane","sangamner","tajane","rajpur"));
		  
	    Set<String> stringDuplicate = stringList.stream()
	    		.filter(i -> Collections.frequency(stringList, i) >1)
                .collect(Collectors.toSet());
	    
	    System.out.println(stringDuplicate);
	
// another way to find out duplicate number 	    
	  
	    Integer[] numbers = new Integer[] { 1, 2, 1, 3, 4, 4 };
	    Set<Integer> allItems = new HashSet<>();
	    Set<Integer> duplicates = Arrays.stream(numbers)
	            .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
	            .collect(Collectors.toSet());
	    System.out.println(duplicates);
	
// another way to find duplicate 
	    
	    Stream<String> stream = Stream.of("john", "doe", "doe", "tom", "john");
		   
	    Set<String> items = new HashSet<>();

	    stream.filter(n -> !items.add(n))
	            .collect(Collectors.toSet())
	            .forEach(System.out::println);
	    // if you miss the foreach then it will not run or innstread of if you print set "items" 
	    // then it will print only unique from set 
	   
	}
	
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub

		NewInterviewProgram test = new NewInterviewProgram();
		//test.findDuplicateUsingStreamFunction();
		 
	}

}
