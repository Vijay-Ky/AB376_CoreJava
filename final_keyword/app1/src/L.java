class L
{
	public static void main(final String[] args)
	{
		System.out.println(args[0]);
		args[0] = "hello";
		System.out.println(args.length);
		System.out.println(args[0]);
		//System.out.println(args[1]);
		System.out.println("done");
		//args[0] = "hello";

		//System.out.println(args.length);
		/*
		args[0] = "hello";
		args[1] = "hellooo";
		args[2] = "hellooooo";
		args[3] = "hellooooooo";
		System.out.println(args[0]);
		*/
		/*
		final int[] i = new int[5];
		i[0] = 100;
		i[1] = 200;
		i[2] = 300;
		i[3] = 400;
		i[4] = 500;
		System.out.println(i[0]);
		i[0] = 1000;
		System.out.println(i[0]);
		i = new int[10];
		System.out.println(i.length);
		*/

	}
}
/*
Yes, arrays are fixed-size,
meaning you can't change the size of an array.
An array can still be created with any size at runtime
*/