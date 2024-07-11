package day12;

// 超載計算機
public class Calculator {
	
	public static void calc(int x) {
		System.out.println("A");
	}
	
	public static void calc(double x) {
		System.out.println("B");
	}
	
	public static void calc(Integer x) {
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		calc(100); // A
		calc(3.14); // B
		calc(Integer.valueOf(200)); // C
		Integer x = 200;
		calc(x); // C
	}
	
}
