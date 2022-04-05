class Manager13
{
	public static void main(String[] args)
	{
		A a1 = (A)new B();
		B b1 = a1;//its downcasting not possible implicitly
		System.out.println("done");
	}
}

//parent class ref to sub class ref === not possible automicaly(implicitly)