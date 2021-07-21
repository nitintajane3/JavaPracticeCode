package oopsConcepts.inheritance;

public class Inheritancewithmethodoverriding extends ParentClass
{
	public void childClassMethod() 
	{
		System.out.println("child class method");
	}
	
	public void display() 
	{
		//super.display();
		
		System.out.println("child class display method");
		
	}
	public static void main(String[] args) 
	{
		// get error you can't create object of parent class using child class reference 
		/*Inheritancewithmethodoverriding inte = (Inheritancewithmethodoverriding) new ParentClass();
		inte.childClassMethod();
		inte.parentClassMethod();*/
		// here you call both child and parent class  method
		
	
System.out.println("parent class object reference and parent class object");		
		ParentClass prt = new ParentClass();
		prt.parentClassMethod();
		prt.display(); // here calling parent class overridden method
		// here you can access only parent class methods
	
System.out.println("child class object reference and child class object");		
		Inheritancewithmethodoverriding trp = new Inheritancewithmethodoverriding();
		trp.childClassMethod();
		trp.parentClassMethod();
		trp.display();  // here calling child  class overridden method
		// here you can access both parent and child class methods
		
System.out.println("parent class object reference and child class object");
		ParentClass prty = new Inheritancewithmethodoverriding();
		prty.parentClassMethod();
		prty.display(); // here calling child class overridden method 
		// here calling only parent class method not child class method
		// but here calling child overridden method
		/*Now if we create a Derived class object and call this overridden display() function from it , 
		then due to dynamic binding in Java, always derived class display() method will be called*/
		
System.out.println("parent class object reference and child class object with parent class casting ");
		ParentClass prtycast = (ParentClass) new Inheritancewithmethodoverriding();
		prtycast.parentClassMethod();
		prtycast.display(); 
		// still child class overridden method call
		
// to call parent class overridden method we should have to use super keyword to call it 
		// refer below code to call parent class overridden method 
		/*public void display() 
		{
			//super.display();
			System.out.println("child class display method");	
		}*/
		
		
		
	}

}
