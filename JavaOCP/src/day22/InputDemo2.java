package day22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDemo2 {

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
			System.out.println("輸入發生錯誤, 請執行並重新輸入!"); // 自訂訊息
		}
		scanner.close();
	}

}
