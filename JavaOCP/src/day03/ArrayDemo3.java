package day03;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] scores = new int[5]; // 預設內容 => {0, 0, 0, 0, 0}
		// 印出陣列元素
		System.out.println(Arrays.toString(scores));
		// 指定元素內容
		scores[1] = 99;
		scores[2] = 77;
		scores[3] = 88;
		// 印出陣列元素
		System.out.println(Arrays.toString(scores));
		
	}

}
