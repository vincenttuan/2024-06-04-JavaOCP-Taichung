package day05;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyltiArray6 {
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
						 .flatMapToInt(array -> IntStream.of(array).filter(value -> value >= 0))
						 .sum();
		System.out.printf("x總分: %d%n", sumX);
		
		int sumY = Stream.of(y)
				 .flatMapToInt(array -> IntStream.of(array).filter(value -> value >= 0))
				 .sum();
		System.out.printf("y總分: %d%n", sumY);
		
		
		
	}
}
