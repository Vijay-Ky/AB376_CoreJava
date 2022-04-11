class Y
{ 
	final String fs;
	Y()
	{
		this.fs = "abcabc";
	}
	Y(final String fs)
	{
		//this.fs = "xyz";
		fs = "xyz";
	}

	public static void main(String[] args)
	{
		Y y2 = new Y();
		Y y3 = new Y("abc");
		System.out.println(y2.fs);
		System.out.println(y3.fs);
	}
}