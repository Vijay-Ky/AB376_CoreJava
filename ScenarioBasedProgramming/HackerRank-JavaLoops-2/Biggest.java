import java.util.Scanner;
class Biggest 
{
	public static void main(String[] args) 
	{
		System.out.println("Biggest of Two Numbers!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter first Number: ");
		int i = sc.nextInt();
		System.out.println("Please Enter second Number: ");
		int j = sc.nextInt();

		if(i < j)
		{
			System.out.println("Biggest of " + i + " and " + j + " is " +  j);
		}
		else if(i == j)
		{
			System.out.println("The value: " + i + " and" + " The value: " + j + " Are equal!");
		}
		else 
		{
			System.out.println("Biggest of " + i + " and " + j + " is " +  i);
		}
		
	}
}
