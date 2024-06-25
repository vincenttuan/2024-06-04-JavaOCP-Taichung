package day07;

public class StringDemo9 {
	
	public static String update(String s) {
		s = s.concat("8");
		return s;
	}
	
	public static int update(int foo) {
		foo = foo + 1;
		return foo;
	}
		
	public static void main(String[] args) {
		String a = "Java";
		a = update(a);
		System.out.println(a);
		//--------------------------------
		int bar = 10;
		bar = update(bar);
		System.out.println(bar);
	}
}
