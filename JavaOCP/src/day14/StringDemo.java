package day14;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		// String 自己有實作 equals() 而非使用 Object 的 equals()
		System.out.println(s1.equals(s2));
		
	}

}
