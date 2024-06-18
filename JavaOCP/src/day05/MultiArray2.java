package day05;

import java.util.Arrays;

public class MultiArray2 {
	public static void main(String[] args) {
		// 建立一個 2x3 的二維陣列-含有初始值
		int[][] x = {
						{100, 90, 80}, 
						{70, 60, 50}
					};
		System.out.println(x.length); // 2
		//System.out.println(Arrays.toString(x[0]));
		//System.out.println(Arrays.toString(x[1]));
		
		for(int i=0,lens=x.length ; i<lens ; i++) {
			System.out.println(Arrays.toString(x[i]));
		}
		
		
	}
}
