package day05;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiArray5 {

	public static void main(String[] args) {
		int[][] x = {
						{100, 90, 70},
						{80, 60},
						{50, 40, 70, 90}
					};
		// 計算總分 
		int sum1 = 0;
		for(int i=0 ; i<x.length ; i++) {
			for(int k=0 ; k < x[i].length ; k++) {
				sum1 += x[i][k];
			}
		}
		System.out.printf("總和: %d%n", sum1);
		
		int sum2 = 0;
		for(int[] array : x) {
			for(int value : array) {
				sum2 += value;
			}
		}
		System.out.printf("總和: %d%n", sum2);
		
		int sum3 = Stream.of(x).flatMapToInt(array -> IntStream.of(array)).sum();
		System.out.printf("總和: %d%n", sum3);
	}

}
