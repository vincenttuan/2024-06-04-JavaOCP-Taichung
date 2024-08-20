package day22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		input();
	}
	
	// 使用者輸入半徑可以計算出圓面積
	public static void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入半徑:");
		try {
			int r = scanner.nextInt();
			double area = r*r*Math.PI;
			System.out.printf("半徑: %d 圓面積: %.1f%n", r, area);
		} catch (InputMismatchException e) {
			System.err.println("輸入發生錯誤"); // 自訂訊息
			System.err.println("錯誤訊息1:" + e); // 錯誤訊息1
			System.err.println("錯誤訊息2:" + e.getMessage()); // 錯誤訊息2
			System.err.println("錯誤類型:" + e.getCause()); // 錯誤類型
			System.err.println("詳細錯誤資訊:");
			e.printStackTrace(System.err); // 詳細錯誤資訊
		}
		scanner.close();
	}

}
