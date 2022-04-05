class Manager28
{
	public static void main(String[] args)
	{
		Object a1 = (Object)new A();
		//A a1 = new A();
		//Object o1 = a1;
		//A a1 = null;
		//C a1 = new C();
		System.out.println(a1 instanceof Object);//whether A can be an instance Object
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);
		System.out.println(a1 instanceof D);
	}
}
/*
1.each and every class can become an instace of object class.
*/