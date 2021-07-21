package constrcutor_program;

public class Static_Block_child extends Static_Block_Parent
{

	public Static_Block_child()
	{
		System.out.println("child class constructor");
	}
	/*static{
        System.out.println("static block of child class");
    }
	
	static{
        System.out.println("static block of child 2 class");
    }*/
	
    public void display()
    {
        System.out.println("Just a method of child class");
    }
    public static void main(String args[])
    {
    	Static_Block_child obj = new Static_Block_child();
        obj.display();
        
        Static_Block_child obj2 = new Static_Block_child();
        obj2.display();
        // here again constructor will be execute
    }

}
