package day01;

// 具有回傳值的方法
public class MethodDemo6 {

	public static void main(String[] args) {
		// 某方法傳入 7, 1 得到 8 個別印出 "8"
		// 某方法傳入 3, 2 得到 5 個別印出 "3 + 2 = 5"
		
		int sum1 = getSum(7, 1);
		System.out.println(sum1);
		
		int x = 3, y = 2;
		int sum2 = getSum(x, y);
		System.out.printf("%d + %d = %d%n", x, y, sum2);
	}
	
	public static int getSum(int x, int y) {
		int sum = x + y;
		return sum;
	}
	
}
