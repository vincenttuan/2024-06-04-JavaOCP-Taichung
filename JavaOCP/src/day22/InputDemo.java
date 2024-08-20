package day22;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		input();
	}
	
	// 使用者輸入半徑可以計算出圓面積
	public static void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入半徑:");
		int r = scanner.nextInt();
		double area = r*r*Math.PI;
		System.out.printf("半徑: %d 圓面積: %.1f%n", r, area);
		scanner.close();
	}

}
