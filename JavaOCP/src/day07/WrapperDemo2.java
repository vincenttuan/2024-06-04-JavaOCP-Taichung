package day07;

public class WrapperDemo2 {
	public static void main(String[] args) {
		// Java 5.0 以前
		Integer x = Integer.valueOf(10);
		Integer y = Integer.valueOf(20);
		int x1 = x.intValue();
		int y1 = y.intValue();
		System.out.println(x1 + y1);
		
		// Java 5.0 支援 Auto-Boxing / Auto-Unboxing 的機制
		// 編譯器會自動補足程式碼
		Integer a = 10; // Auto-Boxing: Integer.valueOf(10)
		Integer b = 20; // Auto-Boxing: Integer.valueOf(20)
		int a1 = a;     // Auto-Unboxing: a.intValue()
		int b1 = b;     // Auto-Unboxing: b.intValue()
		System.out.println(a1 + b1);
		
		Integer i = 10; // Auto-Boxing: Integer.valueOf(10)
		Integer j = 20; // Auto-Boxing: Integer.valueOf(20)
		System.out.println(i + j); // Auto-Unboxing: i.intValue() + j.intValue()
	}
}
