class M2
{
	public static void main(String[] args) 
	{
		try
		{
			test();
		}
		catch (ClassNotFoundException ex)
		{
		}
		
		System.out.println("done");
	}
	static void test() throws ClassNotFoundException
	{	
		Class.forName("");//dont look for try-catch for this statement look for the try-catch while calling test() method.
	}
}
