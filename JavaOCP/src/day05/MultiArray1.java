package day05;

import java.util.Arrays;

public class MultiArray1 {

	public static void main(String[] args) {
		// 建立一個 3x3 的二維陣列
		char[][] x = new char[3][3];
		x[0][0] = 'O';
		x[0][1] = 'X';
		x[0][2] = 'O';
		x[1][0] = 'O';
		x[1][1] = 'O';
		x[1][2] = 'X';
		x[2][0] = 'X';
		x[2][1] = 'X';
		x[2][2] = 'O';
		System.out.println(Arrays.toString(x[0]));
		System.out.println(Arrays.toString(x[1]));
		System.out.println(Arrays.toString(x[2]));
		

	}

}
