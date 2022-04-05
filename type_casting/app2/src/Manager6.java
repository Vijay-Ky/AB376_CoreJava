class Manager6
{
	public static void main(String[] args)
	{
		A a1 = (A) new C();
		Object o1 = (Object) new D();
		B b1 = (B) new C();
		C c1 = (C) new D();
		B b2 = (B) new D();
		Object o2 = (Object) new C();
		System.out.println("done");
	}
}