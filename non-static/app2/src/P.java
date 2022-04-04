class P
{
	P()
	{
		this(10, 20);
		System.out.println("P()");
	}
	P(int i, int j)
	{
		//super();
		System.out.println("P(int, int)");
	}
	public static void main(String[]args)
	{
		P p1 = new P();
		System.out.println("-----");
		P p2 = new P(1, 2);
		System.out.println("-----");
	}
}