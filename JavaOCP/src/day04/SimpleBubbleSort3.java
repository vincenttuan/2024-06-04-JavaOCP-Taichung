package day04;

import java.util.Arrays;

public class SimpleBubbleSort3 {

	public static void main(String[] args) {
		int[] scores = {10, 8, 6, 7, 5};
		// 排序前
		System.out.println("排序前:" + Arrays.toString(scores));
		
		// 排序後
		bubbleSort(scores, true);
		System.out.println("泡沫排序法(小到大):" + Arrays.toString(scores));
		
		bubbleSort(scores, false);
		System.out.println("泡沫排序法(大到小):" + Arrays.toString(scores));
		
		
	}
	
	// 泡沫排序陣列
	// asc: true 由小到大, false: 由大到小
	public static void bubbleSort(int[] array, boolean asc) {
		int n = array.length;
		//---------------------------------------------------------
		for(int j=0;j<n-1;j++) {
			for(int i=0;i<n-1-j;i++) {
				if(asc ? array[i] > array[i+1] : array[i] < array[i+1]) {
					// 資料互換
					int tmp = array[i+1];
					array[i+1] = array[i];
					array[i] = tmp;
				}
			}
		}
		//---------------------------------------------------------
	}

}
