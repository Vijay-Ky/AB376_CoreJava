class X
{
	public static void main(String[] args)
	{
		int i = 0;
		do
		{
			System.out.println("loop1 begin:" + i);
			int j = 0;
			do
			{
				System.out.println("loop2 begin:" + j);
				j++;
				if(j > 1)
				{
					break;
				}
				System.out.println("loop2 end:" + j);
			}
			while (j < 2);
			i++;
			System.out.println("loop1 end:" + i);
		}
		while (i < 3);
	}
}