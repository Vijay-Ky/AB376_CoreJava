interface A
{
	void test(int i);
}
class M4
{
	public static void main(String[] args) 
	{
		//if it is overloading then dataype is required 
		//but here only one method so there is no need of specifying dataype
		//just we can supply identifier to the argument
		A a2 = (x) -> {
						System.out.println("from test:" + x);
						System.out.println("from test");
						System.out.println("from test");
					 };
		a2.test(20);
	}
}
