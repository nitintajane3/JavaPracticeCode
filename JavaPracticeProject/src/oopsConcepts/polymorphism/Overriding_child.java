package oopsConcepts.polymorphism;

public class Overriding_child extends Overridden_parent
{

	final void display() 
	{
		System.out.println("overriddening  method display");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Overriding_child over = new Overriding_child();
		over.display();
		
		Overridden_parent overparent = new Overridden_parent();
		overparent.display();
	}

}
