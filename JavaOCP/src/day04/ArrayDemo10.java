package day04;

import java.util.stream.IntStream;

public class ArrayDemo10 {

	public static void main(String[] args) {
		// 在有效分數 >= 0 的條件下
		// 請請求出 總分, 平均, 最大, 最小, 有效分數個數 
		int[] scores = {100, 90, -1, 50, 85};
		int sum    = IntStream.of(scores).filter(score -> score >= 0).sum(); 
		double avg = IntStream.of(scores).filter(score -> score >= 0).average().getAsDouble();
		int max    = IntStream.of(scores).filter(score -> score >= 0).max().getAsInt();
		int min    = IntStream.of(scores).filter(score -> score >= 0).min().getAsInt();
		long count = IntStream.of(scores).filter(score -> score >= 0).count();
		
		System.out.printf("總分:%d, 平均:%.1f, 最大:%d, 最小:%d, 有效分數個數:%d%n", sum, avg, max, min, count);
		
	}

}
