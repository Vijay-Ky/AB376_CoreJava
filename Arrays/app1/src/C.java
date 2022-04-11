public class C
{
	public static void main(String []args)
	{
		int[] x;
		x = new int[3];
		x = null;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);	
	}
}
/*
- if you are calling anything on the null reference you will get NullPointerException
- if you are tyring to access the array index which which is not available you will get IndexOut
OfBoundsException
-if the array reference is null then if you are trying to access the index of that array
you will get NullPointerException
*/