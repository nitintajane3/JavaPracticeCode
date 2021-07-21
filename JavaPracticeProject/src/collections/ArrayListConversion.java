package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListConversion 
{

	public void Convert_LinkedList_to_ArrayList() 
	{
		LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Harry");
	    linkedlist.add("Jack");
	    linkedlist.add("Tim");
	    linkedlist.add("Rick");
	    linkedlist.add("Rock");

	    ArrayList<String> list = new ArrayList<String>(linkedlist);

	    for (String str : list){
	      System.out.println(str);
	    }
	}
	
	public void Convert_Vector_to_ArrayList() 
	{
		Vector<String> vector = new Vector<String>();
		 
	     // Populate Vector
	     vector.add("Rahul");
	     vector.add("Steve");
	     vector.add("Jude");
	     vector.add("Locke");
	     vector.add("Mike");
	     vector.add("Robert");
	 
	     //Displaying Vector elements
	     for (String str : vector){
	        System.out.println(str);
	     }
	 
	     //Converting Vector to ArrayList
	     ArrayList<String> arraylist = new ArrayList<String>(vector);
	 
	     //Displaying ArrayList Elements
	     System.out.println("\nArrayList Elements :");
	     for (String s : arraylist){
	        System.out.println(s);
	     }
	}
	public void Convert_ArrayList_to_String_Array() 
	{
		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("String1");
		arrlist.add("String2");
		arrlist.add("String3");
		arrlist.add("String4");

		/*ArrayList to Array Conversion */
		String array[] = new String[arrlist.size()];              
		for(int j =0;j<arrlist.size();j++){
		  array[j] = arrlist.get(j);
		}

		/*Displaying Array elements*/
		for(String k: array)
		{
			System.out.println(k);
		}
	}
	
	public void Convert_Array_to_ArrayList() 
	{
		 String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

		  /*Array to ArrayList conversion*/
		  ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));

		  /*Adding new elements to the converted List*/
		  citylist.add("New City2");
		  citylist.add("New City3");

		  /*Final ArrayList content display using for*/
		  for (String str: citylist)
		  {
			System.out.println(str);
	       	  }
		  
		  System.out.println("printing arraylist "+citylist);
	}
	
	public void Convert_HashSet_to_ArrayList() 
	{
		// Create a HashSet
	     HashSet<String> hset = new HashSet<String>();
	 
	     //add elements to HashSet
	     hset.add("Steve");
	     hset.add("Matt");
	     hset.add("Govinda");
	     hset.add("John");
	     hset.add("Tommy");
	 
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: "+ hset);
	 
	     // Creating a List of HashSet elements
	     List<String> list = new ArrayList<String>(hset);
	 
	     // Displaying ArrayList elements
	     System.out.println("ArrayList contains: "+ list);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ArrayListConversion arrayListConversion = new ArrayListConversion();
		arrayListConversion.Convert_Array_to_ArrayList();
		
		
	}

}
