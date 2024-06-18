package day05;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyltiArray7 {
	public static void main(String[] args) {
		int[][] x = {
						{100, -10, 70},
						{80, 60},
						{50, -1, -70, 90}
					};
		// 取得 score >= 0 的總分
		int sum1 = 0;
		for(int i=0 ; i<x.length ; i++) {
			for(int k=0 ; k<x[i].length ; k++) {
				if(x[i][k] >= 0) {
					sum1 += x[i][k];
				}
			}
		}
		System.out.printf("總分: %d%n", sum1);
		
		int sum2 = 0;
		for(int[] array : x) {
			for(int value : array) {
				if(value < 0) {
					continue;
				}
				sum2 += value;
			}
		}
		System.out.printf("總分: %d%n", sum2);
		
		int sum3 = Stream.of(x)
						 .flatMapToInt(array -> IntStream.of(array))
						 .filter(value -> value >= 0)
						 .sum();
		System.out.printf("總分: %d%n", sum3);
		
		int sum4 = Stream.of(x)
						 .flatMapToInt(array -> IntStream.of(array).filter(value -> value >= 0))
						 .sum();
		System.out.printf("總分: %d%n", sum4);
		
		
	}
}
