package oopsConcepts.polymorphism;

public class MethodOverloading_one 
{
 public void display(String a) 
 {
	 System.out.println("first method having String data type" + a);
 }
	
 public void display(int d) 
 {
	System.out.println("second method having byte data type" + d);
 }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MethodOverloading_one test = new MethodOverloading_one();
		test.display(24);
	}

}
