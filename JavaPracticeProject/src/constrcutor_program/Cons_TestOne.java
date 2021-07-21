package constrcutor_program;

public class Cons_TestOne 
{

	public Cons_TestOne(){ }
	private int var=10;
    public Cons_TestOne(int num)
    {
           var=num;
    }
    public int getValue()
    {
            return var;
    }
    public static void main(String args[])
    {
    	Cons_TestOne myobj = new Cons_TestOne();
            System.out.println("value of var is: "+myobj.getValue());
    }

}
