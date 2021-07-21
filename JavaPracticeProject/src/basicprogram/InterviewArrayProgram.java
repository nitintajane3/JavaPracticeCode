package basicprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewArrayProgram 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] A = {1,5,8,7,3,6};
		int[] B = {2,9,4};
		
		List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(B).boxed().collect(Collectors.toList());
		List<Integer> combine = new ArrayList<>();
		combine.addAll(list);
		combine.addAll(list2);
		
		System.out.println(list);
		System.out.println(combine);
		Collections.sort(combine);
		System.out.println(combine);
	
		List<Integer> extractA = combine.subList(0, A.length);
		List<Integer> extractB = combine.subList(A.length, A.length+B.length);
		
		System.out.println(extractA);
		System.out.println(extractB);
		
// second approch for integer to array		
		int[] ints = {1, 2, 3};
		List<Integer> intList = new ArrayList<Integer>();
		
		for (int i = 0; i < ints.length; i++) 
		{
			 intList.add(ints[i]);
		}
		
		System.out.println(intList);
		
	}

}
