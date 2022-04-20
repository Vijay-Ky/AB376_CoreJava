public class E {

	public static void main(String[] args) {
		int[] x = new int[10];
		int[] y = new int[20];
		System.out.println(x.length);
		System.out.println(y.length);
		x = y;
		System.out.println(x.length);
		System.out.println(y.length);
		y = x;
		System.out.println(x.length);
		System.out.println(y.length);
		System.out.println("done");
	}
}
