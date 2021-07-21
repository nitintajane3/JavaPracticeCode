package collections;

import java.util.ArrayList;

public class ComparingTwoArray 
{

	public static void main(String[] args) 
	{
		 ArrayList<String> al1= new ArrayList<String>();
         al1.add("hi");
         al1.add("How are you");
         al1.add("Good Morning");
         al1.add("bye");
         al1.add("Good night");

         ArrayList<String> al2= new ArrayList<String>();
         al2.add("Howdy");
         al2.add("Good Evening");
         al2.add("bye");
         al2.add("Good night");
         
         // here we are directly comparing two array 
         boolean twoarray = al1.contains(al2);
         System.out.println(twoarray);
         
         // here we adding compare value into third array list to store compare value
         ArrayList<String> thirdarray = new ArrayList<String>();
         
         for (String secondarray : al1) 
         {
        	 thirdarray.add(al2.contains(secondarray) ? "yes" : "no");
        	 
		 }
         System.out.println("print third array : " + thirdarray);
         

	}

}
