package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) 
	{
	
		// TODO Auto-generated method stub

		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(10);
		test.add(13);
		test.add(9);
		test.add(30);
		test.add(19);
		test.add(50);
		
		for(Integer sortnumber : test)
		{
			System.out.print(" " + sortnumber + " ");
		}
		
		Collections.sort(test);
		
		System.out.println();
		for(Integer aftersortnumber : test)
		{
			System.out.print( " "+ aftersortnumber+ " ");
		}
		
		System.out.println();
		
		Collections.sort(test,Collections.reverseOrder());
		
		for(Integer afterdesendingsortnumber : test)
		{
			System.out.print( " "+ afterdesendingsortnumber+ " ");
		}
	
		System.out.println("Last occurrence of element 1: "+test.lastIndexOf(1));
	    System.out.println("Last occurrence of element 9: "+test.lastIndexOf(9));
	    System.out.println("Last occurrence of element 13: "+test.lastIndexOf(13));
		
	}

}
