public class M45
{
	static void test(int x, String...y)
	{
		System.out.print(x + " ,");
		System.out.print(y.length);
		System.out.println();
	}
	public static void main(String [] args)
	{
		//test();//error
		test(10);
		test(1,"abc");
		test(30,"xyz","hello");
		test(40,"done","check","hello");
	}
}
