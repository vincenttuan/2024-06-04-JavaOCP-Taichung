package day07;

public class StringDemo9 {
	
	public static String update(String s) {
		s = s.concat("8");
		return s;
	}
		
	public static void main(String[] args) {
		String a = "Java";
		a = update(a);
		System.out.println(a);
	}
}
