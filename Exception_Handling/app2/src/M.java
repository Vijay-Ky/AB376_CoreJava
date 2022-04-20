class M 
{
	public static void main(String[] args) 
	{

		System.out.println("main begin");
		try
		{
			int i = 10 / 0;
			System.out.println("from try");
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
