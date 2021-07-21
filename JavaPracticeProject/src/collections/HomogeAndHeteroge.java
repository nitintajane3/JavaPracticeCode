package collections;

import java.util.ArrayList;

public class HomogeAndHeteroge {

	
	public void homoGeniousObjects() {
		int[] test1 = new int[4];
		test1[0] = 12;
				test1[1] = 11;
				test1[2] = 7;
				test1[3] = 5;
				//test1[3] = "string";      here get compile time error not convert into interger into string
					
				System.out.println(test1[1]);
		
	}
	
	
	public void HeteroGeniosObject() 
	{
		ArrayList test = new ArrayList();
		test.add(121);
		test.add("nitin");
		test.add("tajane");
		test.add(99);
		
		for(Object rewe : test)
		{
			System.out.println(rewe);
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		HomogeAndHeteroge heteroge = new HomogeAndHeteroge();
		heteroge.homoGeniousObjects();
		heteroge.HeteroGeniosObject();
	}

}
