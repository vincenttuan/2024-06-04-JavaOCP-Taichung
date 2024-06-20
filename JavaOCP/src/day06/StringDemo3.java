package day06;

public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "jAvA";
		System.out.println(s1 == s2); // 比較 stack 內容值
		System.out.println(s1.equals(s2)); // 比較時有分大小寫
		System.out.println(s1.equalsIgnoreCase(s2)); // 比較時不分大小寫
		
		
	}
}
