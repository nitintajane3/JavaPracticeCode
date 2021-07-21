package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetAndTreeSet 
{

	public void hashSetExample() 
	{
	
		// null accept  in hashset if we enter more than one null then it take only null
		//duplicate accepted  in hashset and its override previous value with new one and showing only one value
		// insertion order not maintain 
		//these classes are non-synchronized that means they are not thread-safe and should be synchronized explicitly when there is a need of thread-safe operations.
		
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("aaa");
		hashset.add(null);
		hashset.add(null);
		hashset.add("bbb");
		hashset.add(null);
		hashset.add("ccc");
		hashset.add("bbb");
		
		System.out.println("print the hashset :  " + hashset);
	}
	
	public void treeSetExample() 
	{
	
		//null value not accepted showing nullpointerexception
		// duplicate can enter but its showing only one value 
		// insertion order has maintain in ascending order by default.
		//these classes are non-synchronized that means they are not thread-safe and should be synchronized explicitly when there is a need of thread-safe operations.
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("bbb");
		treeSet.add("ccc");
		treeSet.add("eee");
		treeSet.add("aaa");
		treeSet.add("ddd");
		treeSet.add("bbb");
		treeSet.add("aaa");
		
		System.out.println("print the treeset : " + treeSet);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		HashSetAndTreeSet hashSetAndTreeSet = new HashSetAndTreeSet();
		hashSetAndTreeSet.hashSetExample();
		hashSetAndTreeSet.treeSetExample();
		
	}

}
