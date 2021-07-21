
public  class CheckingStaticClass 
{
	int test1 = 10;
	static int test2 = 13;
	final int test3 = 14;
	
	public void methodOne() 
	{
		System.out.println("method normal");
	}
	
	public final void methodTwo() 
	{
		System.out.println("method two final method");
	}
	 public static void methodThree() 
	 {
		 System.out.println("method static three");
	}

	public static class test
	{
	  
		int test4 = 11;
		static int test5 = 15;
		final int test6 = 17;
		
		
		public void methodOneInner() 
		{
			System.out.println("inner class method normal");
		}
		
		public final void methodTwoInner() 
		{
			System.out.println("inner class method two final method");
		}
		 public static void methodThreeInner() 
		 {
			 System.out.println("inner class method static three");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CheckingStaticClass.test checkingStaticClass = new CheckingStaticClass.test();
		// checkingStaticClass.m
		 
		MakingPrivateConstructor tdfdf = MakingPrivateConstructor.test3();
		tdfdf.newMethodFOr();
		 
	}

	private class orio
	{
		
	}
}
