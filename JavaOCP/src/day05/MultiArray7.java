package day05;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiArray7 {
	public static void main(String[] args) {
		int[][] x = {
						{100, -10, 70},
						{80, 60},
						{50, -1, -70, 90}
					};
		int[][] y = {
						{80, -10, 60},
						{90, -60},
						{50, -1, -70, 0}
					};
		// 個別取得 score >= 0 的總分
		int sumX = Stream.of(x)
						 .flatMapToInt(array -> getPassingScores(array))
						 .sum();
		System.out.printf("x總分: %d%n", sumX);
		
		int sumY = getSum(y);
		System.out.printf("y總分: %d%n", sumY);
		
	}
	
	private static int getSum(int[][] multiArray) {
		return Stream.of(multiArray)
		 		 .flatMapToInt(array -> getPassingScores(array))
		 		 .sum();
	}
	
	private static IntStream getPassingScores(int[] array) {
		return IntStream.of(array).filter(value -> value >= 0);
	}
	
}
