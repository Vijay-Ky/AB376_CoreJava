class Manager17
{
	public static void main(String[] args)
	{
		A a1 = new D();
		B b1 = (B) a1;
		C c1 = (C) b1;
		D d1 = (D) c1;

		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
	}
}