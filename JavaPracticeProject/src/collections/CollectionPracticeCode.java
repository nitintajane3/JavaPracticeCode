package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionPracticeCode {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		HashSet<String> hashset = new HashSet<String>();
		hashset.add("hashset aaa");
		hashset.add(null);
		hashset.add(null);
		hashset.add("hashset bbb");
		hashset.add(null);
		hashset.add("hashset ccc");
		hashset.add("hashset bbb");
		
		LinkedList<Object> linkedlist = new LinkedList<Object>();
		linkedlist.add("link aaa");
		linkedlist.add("linnk bbb");
		linkedlist.add("link ccc");
		linkedlist.add("link bbb");
		
		ArrayList<String> arrayList =  new ArrayList<String>();		
		arrayList.add("arrayList aaa");
		arrayList.add("arrayList bbb");
		arrayList.add("arrayList ccc");
		arrayList.add("arrayList bbb");
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("linkedHashSet aaa");
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		linkedHashSet.add("linkedHashSet bbb");
		linkedHashSet.add(null);
		linkedHashSet.add("linkedHashSet ccc");
		linkedHashSet.add("linkedHashSet bbb");
		
		
		
		for (String stringlinkhashmap : linkedHashSet) 
		{
			System.out.println("linkhashmaped " + stringlinkhashmap);
		}
		
		// converting hashset to array 
		
		String array[] = new String[hashset.size()];
		hashset.toArray(array);
		
		for (String stringtoarray : array) 
		{
			System.out.println("print the hashset to array : " + stringtoarray);
		}
	   
	  
		
	    // converting linklist to array 
	    String[] linkarray = linkedlist.toArray(new String[linkedlist.size()]);
	    for (String stringarray : linkarray) 
	    {
			System.out.println(" covert linklist to array " + stringarray);
		}
	    
	   
	    // method 2 for linklist to array
	    String[] linkarray2 = new String[linkedlist.size()];
	    linkedlist.toArray(linkarray2);
	    
	    for (String stringarray2 : linkarray2) 
	    {
			System.out.println(" method 2 covert linklist to array " + stringarray2);
		}
	    
	    
		// covert array to arraylist
	    
	    String[] citynames = {"pune","mumbai","nashik","anagar","dhule","bid","sangamner"};
	    
		  ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));
		  for (String stringcity : citylist) 
		  {
			System.out.println("convert array to array list : " + stringcity);
		  }
		  
		  
		 
		  
		  
		  //Convert ArrayList to String Array
		
		  String singlearray[] = new String[arrayList.size()];              
		  		
		  for(int j =0;j<arrayList.size();j++)
		  		{
		  		  array[j] = arrayList.get(j);
		  		}

		  		/*Displaying Array elements*/
		  		for(String k: array)
		  		{
		  			System.out.println(" covert arraylist to array " + k);
		  		}
	}

}
