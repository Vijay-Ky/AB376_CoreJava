class I
{
	static float test1(int i)
	{
		return (float)test2(i);
	}
	static long test2(int i)
	{
		return (long)i;
	}
	public static void main(String[]args)
	{
		byte b = 10;
		double d = (double)test1((int)b);
		System.out.println(d);
		System.out.println("done");
	}
}