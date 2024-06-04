package day01;

public class MethodDemo3 {
	
	public static void main(String[] args) {
		System.out.println("1+2=3");
		System.out.println("3+5=8");
		
		printAdd(1, 2); // 可以印出 "1+2=3"
		printAdd(3, 5); // 可以印出 "3+5=8"
		
		printDiv(10, 5); // 可以印出 "10/5=2"
		printDiv(1, 2); //  可以印出 "1/2=0"
		printDiv(3, 0); //  可以印出 "分母不可為0"
		
	}
	
	public static void printDiv(int x, int y) {
		/*
		if(y == 0) {
			System.out.println("分母不可為0");
		} else {
			int result = x / y;
			System.out.printf("%d/%d=%d%n", x, y, result);
		}
		*/
		if(y == 0) {
			System.out.println("分母不可為0");
			return;
		}
		int result = x / y;
		System.out.printf("%d/%d=%d%n", x, y, result);
	}
	
	
	public static void printAdd(int x, int y) {
		int sum = x + y;
		System.out.printf("%d+%d=%d%n", x, y, sum);
	}

}
