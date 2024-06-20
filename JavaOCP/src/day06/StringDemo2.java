package day06;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		// 將 s3 放到 String pool 中
		s3 = s3.intern();
		System.out.println(s2 == s3);
	}

}
