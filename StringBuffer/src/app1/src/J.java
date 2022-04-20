public class J {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hellotoall");
		System.out.println(sb);          // 0123456789
		sb.delete(2, 3000);
		System.out.println(sb);
	}
}
/*
 * no exception while going beyond.
 * in case of delete second argument any int number beyond the length
 * */
