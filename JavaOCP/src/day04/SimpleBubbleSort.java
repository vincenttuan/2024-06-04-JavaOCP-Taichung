package day04;

import java.util.Arrays;

public class SimpleBubbleSort {

	public static void main(String[] args) {
		// 泡沫排序法
		//int[] scores = {10, 8, 6, 7, 5};
		int[] scores = {5, 3};
		// 排序前
		System.out.println("排序前:" + Arrays.toString(scores));
		int s1 = scores[0];
		int s2 = scores[1];
		if(scores[1] < scores[0]) {
			// 內容相互對調
			scores[0] = s2;
			scores[1] = s1;
		}
		
		// 排序後
		System.out.println("排序後:" + Arrays.toString(scores));

	}

}
