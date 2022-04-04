class B
{
	public static void main(String[]args)
	{
		byte b = 10;//range: -128 to 127
		int i = b; //auto-upcasting//-2147483648 to 2147483647
		System.out.println(b);
		System.out.println(i);
		System.out.println("done");
	}
}