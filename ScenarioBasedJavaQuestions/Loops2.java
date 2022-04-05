import java.util.Scanner;
class Loops2 
{
	public static void main(String[] args) 
	{
		int total = 0;
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i = 0; i < input; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
		
			total = a;
		
			for(int j = 0; j < n; j++)
			{
				total = (int) (total + (Math.pow(2, j) * b));
				System.out.print(total + " ");
			}
			System.out.println();
		}
	}
}
