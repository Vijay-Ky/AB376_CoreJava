class F 
{
	public static void main(String[] args) 
	{
		String s1 = args[0];
		int i = Integer.parseInt(s1);
		double j = Math.sqrt(i);
		double k = Math.max(100.0, 1000.0);
		System.out.println("square root of " + i + " is: " + j);
		System.out.println("greter is: " + k);
	}
}