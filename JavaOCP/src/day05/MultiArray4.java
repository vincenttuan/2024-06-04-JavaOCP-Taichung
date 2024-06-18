package day05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultiArray4 {
	public static void main(String[] args) {
		// 建立一個 2x3 的二維陣列-含有初始值
		int[][] x = {
						{90, 80, 100}, 
						{70, 50, 60}
					};
		/*
			利用 java stream 取最大值
		  	將二維陣列轉一維陣列
		  	{
			  {90, 80, 100},     =>   {90, 80, 100, 70, 50, 60}
			  {70, 50, 60}    flatMap
			};
		*/
		int max = Arrays.stream(x) // 將 x 二維陣列轉串流
					 	.flatMapToInt(array -> IntStream.of(array)) // 一維陣列轉int串流
					 	.max()
					 	.getAsInt();
		
		System.out.printf("max 最大值 = %d%n", max);
	}
}
