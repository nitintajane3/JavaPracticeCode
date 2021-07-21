package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListiteratorCode 
{

	public void listIteratorOne() 
	{
		ArrayList<String> test = new ArrayList<String>();
		test.add("nitin");
		test.add("tajane");
		test.add("ashwini");
		test.add("kaopare");
		test.add("gauri");
		test.add("sangamner");
		
		ListIterator<String> listIterator = test.listIterator();
		
		while (listIterator.hasNext()) 
		{
			String string = (String) listIterator.next();
			System.out.println("print list in forward  : " + string);
			
		}
		
		while (listIterator.hasPrevious()) 
		{
			String string = (String) listIterator.previous();
			System.out.println("print list in reverse : " + string);
			
		}
	}
	
	public void secondListIterator() 
	{
		ListIterator<String> litr = null;
	    List<String> names = new ArrayList<String>();
	    names.add("Shyam");
	    names.add("Rajat");
	    names.add("Paul");
	    names.add("Tom");
	    names.add("Kate");
	    //Obtaining list iterator
	    litr=names.listIterator();
	 
	    System.out.println("Traversing the list in forward direction:");
	    while(litr.hasNext()){
	       System.out.println(litr.next());
	    }
	    System.out.println("\nTraversing the list in backward direction:");
	    while(litr.hasPrevious()){
	       System.out.println(litr.previous());
	    }
	}
	
	public static void main(String[] args) 
	{
		
		ListiteratorCode listiteratorCode = new ListiteratorCode();
		
		listiteratorCode.listIteratorOne();
		
		
	}

}
