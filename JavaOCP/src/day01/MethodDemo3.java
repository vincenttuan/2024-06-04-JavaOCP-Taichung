package day01;

public class MethodDemo3 {

	public static void main(String[] args) {
		System.out.println("1+2=3");
		System.out.println("3+5=8");
		
		printAdd(1, 2); // 可以印出 "1+2=3"
		printAdd(3, 5); // 可以印出 "3+5=8"
	}
	
	public static void printAdd(int x, int y) {
		int sum = x + y;
		System.out.printf("%d+%d=%d%n", x, y, sum);
	}

}
