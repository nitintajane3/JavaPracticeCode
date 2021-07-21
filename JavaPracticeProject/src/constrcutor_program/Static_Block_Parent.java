package constrcutor_program;

public class Static_Block_Parent 
{

	public Static_Block_Parent() {System.out.println("parent class default cons");}
	public Static_Block_Parent(int a) {}
	public Static_Block_Parent(String f, int a) {}
	public Static_Block_Parent(int a, String c) {}
	
	public void test()
	{
		System.out.println("nitin tajane");
	}
	
	
	/*static
	{
        System.out.println("static block of parent 2 class");
    }*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
