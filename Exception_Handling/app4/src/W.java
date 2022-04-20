public class W
{
	public static void main(String[] args) 
	{	
		if(true)
		{
			return;
		}
		try
		{
			return;
		}
	    catch(ArithmeticException ex)
		{	
			System.out.println(2);
		}
		finally
		{
			System.out.println(3);
		}
		System.out.println(4);
	}
}