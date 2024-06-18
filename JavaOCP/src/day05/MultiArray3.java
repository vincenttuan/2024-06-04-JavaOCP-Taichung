package day05;

public class MultiArray3 {
	public static void main(String[] args) {
		// 建立一個 2x3 的二維陣列-含有初始值
		int[][] x = {
						{90, 80, 100}, 
						{70, 50, 60}
					};
		
		// 印出每一個元素
		for(int i=0 ; i<x.length ; i++) {
			// x[i] 是一維陣列
			for(int k=0 ; k < x[i].length ; k++) {
				System.out.printf("[%d][%d]=%d%n", i, k, x[i][k]);
			}
		}
		// 請找出最大值 = ? for-loop
		int max = Integer.MIN_VALUE;
		System.out.printf("max 初始值 = %d%n", max);
		for(int i=0 ; i<x.length ; i++) {
			for(int k=0 ; k < x[i].length ; k++) {
				if(x[i][k] > max) {
					max = x[i][k]; // 替換最大值 
				}
			}
		}
		System.out.printf("max 最終值 = %d%n", max);
		
		// 請找出最大值 = ? for-each
		int max2 = Integer.MIN_VALUE;
		for(int[] array : x) {
			for(int value : array) {
				if(value > max2) {
					max2 = value;
				}
			}
		}
		System.out.printf("max2 最終值 = %d%n", max2);
		
	}
}
