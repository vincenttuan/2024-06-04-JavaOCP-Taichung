package day05;

public class MultiArray3 {
	public static void main(String[] args) {
		// 建立一個 2x3 的二維陣列-含有初始值
		int[][] x = {
						{90, 80, 100}, 
						{70, 50, 60}
					};
		// 請找出最大值 = ?
		for(int i=0 ; i<x.length ; i++) {
			// x[i] 是一維陣列
			for(int k=0 ; k < x[i].length ; k++) {
				System.out.printf("[%d][%d]=%d%n", i, k, x[i][k]);
			}
		}
	}
}
