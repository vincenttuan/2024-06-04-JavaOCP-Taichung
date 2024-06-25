package day07;

public class StringDemo8 {
	
	public static void update(String s) {
		s = s.concat("8");
	}
	
	public static void update(StringBuffer sb) {
		sb.append("11");
	}
	
	public static void main(String[] args) {
		String a = "Java";
		update(a);
		System.out.println(a);
		//---------------------------------------
		StringBuffer b = new StringBuffer("Java");
		update(b);
		System.out.println(b);
	}
	
}
