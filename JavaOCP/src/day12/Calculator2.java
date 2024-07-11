package day12;

// 超載計算機
public class Calculator2 {
	
	public static void calc(float x) {
		System.out.println("B3");
	}
	
	public static void calc(double x) {
		System.out.println("B4");
	}
	
	public static void calc(Integer x) {
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		calc(100);
		calc('A'); // 100 改為 100.0, B
		
	}
	
}
