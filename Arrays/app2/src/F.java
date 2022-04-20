public class F {

	public static void main(String[] args) {
		byte b = 10;
		int[] x = new int[(int)b];
		byte[] y = new byte[10];
		x = y;// these are objects not variables widening not possible in case of array objects
		y = x;
		System.out.println("done");
	}
}
