package app3;

public class D {
	public static void main(String[] args) {
		String s1 = "java";// creating constant
		String va = "va";
		String s2 = "ja" + va;
		String s3 = "jaa";
		String s4 = "ja";
		System.out.println(s3 == s4);
		System.out.println(s2 == s4);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
/*
//+ operator if found reference either left of right or both then it uses a new operator.creating a new object.
//s1 is different object
//s2 is different object
//totally 4 objects are created.
//s1 = java, s2 = new java
 * */
