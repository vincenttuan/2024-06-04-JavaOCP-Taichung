package day22;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class InputDemo3 {

	public static void main(String[] args) {
		try {
			input();
		} catch (InputMismatchException e) {
			System.out.println("輸入錯誤");
		} catch (ArithmeticException e) {
			System.out.println("人數不可為 0");
		}
		// -----------------------------------
		try {
			input();
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println("錯了~ 不是輸入錯誤就是人數不可為 0 的錯誤");
		}
		// -----------------------------------
		try {
			input();
		} catch (RuntimeException e) {
			System.out.println("執行時期錯誤: 錯誤原因:" + e);
		}
		
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
