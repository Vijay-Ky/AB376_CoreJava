public class B
{
	public static void main(String[] args)
	{
		 int x[] = new int[3000];
		 System.out.println(x[0]);
		 System.out.println(x[1]);
		 System.out.println(x[2]);
		 System.out.println(x[2999]);

		 x[0] = 100;
		 x[1] = 200;
		 x[2] = 300;
		 x[2999] = 400;

		 System.out.println(x[0]);
		 System.out.println(x[1]);
		 System.out.println(x[2]);
		 System.out.println(x[2999]);
	}
}