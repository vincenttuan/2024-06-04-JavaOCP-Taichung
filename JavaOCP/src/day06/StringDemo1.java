package day06;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		char[] chars = {'J', 'a', 'v', 'a'};
		String s3 = new String(chars);
		System.out.printf("s1=%s s2=%s s3=%s%n", s1, s2, s3);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
				
	}

}
