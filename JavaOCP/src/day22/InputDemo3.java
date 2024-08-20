package day22;

import java.util.Random;
import java.util.Scanner;

public class InputDemo3 {

	public static void main(String[] args) {
		input();
	}
	
	// 使用者輸入人數可以計算出每一個人可以分得幾顆蘋果
	public static void input() {
		int apple = new Random().nextInt(10) + 1; // 1~10
		Scanner scanner = new Scanner(System.in);
		System.out.printf("蘋果有 %d 顆, 請輸入分蘋果的人數:", apple);
		int count = scanner.nextInt();
		int avg = apple / count; // 平均每人有幾顆
		System.out.printf("蘋果有 %d 顆, %d 人分, 每人分得: %d 顆%n", apple, count, avg);
		scanner.close();
	}

}
