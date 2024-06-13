package day04;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class ArrayDemo11 {

	public static void main(String[] args) {
		// 在有效分數 >= 0 的條件下
		// 請請求出 總分, 平均, 最大, 最小, 有效分數個數
		// 利用"統計物件"來計算
		int[] scores = {100, 90, -1, 50, 85};
		
		IntSummaryStatistics stat = IntStream.of(scores).filter(score -> score >= 0).summaryStatistics();
		
		System.out.printf("總分:%d, 平均:%.1f, 最大:%d, 最小:%d, 有效分數個數:%d%n", 
				stat.getSum(), stat.getAverage(), stat.getMax(), stat.getMin(), stat.getCount());
		
	}

}
