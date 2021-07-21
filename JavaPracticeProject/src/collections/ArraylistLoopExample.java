package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistLoopExample 
{

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
		
		for (int i = 0; i < test.size(); i++) 
		{
			System.out.println("using for loop : " + test.get(i));
			
		}
		
		System.out.println("print array using foreach loop");
		
		for (Integer foreach : test) 
		{
			System.out.print(foreach);
		}
		
		
		System.out.println();
		
		System.out.println("print array using iterator");
		
		Iterator<Integer> usingiterator = test.iterator();
		
		while (usingiterator.hasNext()) 
		{
			System.out.print(usingiterator.next());
			
		}
		
		
	}

}
