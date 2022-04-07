public class M34
{
	static int test()
	{
		Integer obj = new Integer(20);
		System.out.println("from test()");
		//error in case of JDK<=1.4
		return obj;//auto-unboxing//return obj.intValue();
	}
	public static void main(String [] args)
	{
		//error in case of JDK<=1.4
		Integer o1 = new Integer(test());//test();
		//System.out.println(test());
		System.out.println(o1);
	}
}
