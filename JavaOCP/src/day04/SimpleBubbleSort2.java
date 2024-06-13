package day04;

import java.util.Arrays;

public class SimpleBubbleSort2 {

	public static void main(String[] args) {
		// 泡沫排序法
		int[] scores = {10, 8, 6, 7, 5};
		// 排序前
		System.out.println("排序前:" + Arrays.toString(scores));
		int n = scores.length;
		//---------------------------------------------------------
		for(int j=0;j<n-1;j++) {
			for(int i=0;i<n-1-j;i++) {
				if(scores[i] > scores[i+1]) {
					// 資料互換
					int tmp = scores[i+1];
					scores[i+1] = scores[i];
					scores[i] = tmp;
				}
			}
		}
		//---------------------------------------------------------
		
		// 排序後
		System.out.println("排序後:" + Arrays.toString(scores));
		
	}

}
