package java_basic_program;

public class Metthod_overriding_statickeyword {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ParentClass pc = new ChildClass();  
		//calling display() method by parent class object  
		pc.display2(); 
		pc.display();
	}

}

class ParentClass  
{  
	//we cannot override the display() method  

	public static void display()  
	{  
		System.out.printf("display() method of the parent class.");  
	}
	
	public  void display2()  
	{  
		System.out.println("paarent class display 2 method");  
	}
}  
//child class  

class ChildClass extends ParentClass  
{  
	//the same method also exists in the ParentClass  
	//it does not override, actually it is method hiding  
	public static void display()  
	{  
		System.out.println("Overridden static method in Child Class in Java");  
	} 
	
	public  void display2()  
	{  
		System.out.println("child class display 2 method");  
	}
}  
