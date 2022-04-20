public class F {

	public static void main(String[] args) {
		String s1 = "xyz";
		System.out.println(s1);
		String s2 = s1.toUpperCase();//string modification resulting in a new object creation.
		System.out.println(s1);
		System.out.println(s2);
	}
}
