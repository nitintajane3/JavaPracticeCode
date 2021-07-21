

public class MakingPrivateConstructor 
{
	private MakingPrivateConstructor()
	{
		
	}
	
	static MakingPrivateConstructor test3()
	{
		return new MakingPrivateConstructor();
	}

	public void newMethodFOr() 
	{
		System.out.println("checking pribate things");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
