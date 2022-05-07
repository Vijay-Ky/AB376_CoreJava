interface A   // Functional interface
{
	void test();
}
class M2
{
	public static void main(String[] args) 
	{
		//lambda expressions are only for single method interfaces.
		//if multiple statements use braces
		A a2 = () -> {
						System.out.println("from test");
						System.out.println("from test");
						System.out.println("from test");
					 };
		a2.test();
	}
}
//if more than one method is there we can go for AIC
//if an interface contains only one method then its called marker interface.