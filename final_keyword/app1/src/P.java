class P
{ 
	int i = 10;
	public static void main(String[] args)
	{
		final P p1 = new P();
		p1.i = 20;
		p1.i = 40;
		System.out.println("done");
	}
}
