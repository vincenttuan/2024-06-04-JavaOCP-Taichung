package day21;

import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamDemo4 {

	public static void main(String[] args) {
		List<Integer> scores = List.of(100, 40, 70, 50, 85);
		// 請計算總分
		int sum = scores.stream()
						//.mapToInt(score -> score.intValue())
						//.mapToInt(score -> score)  // auto-unboxing
						.mapToInt(Integer::intValue)
						.sum();	
		System.out.println(sum);
		
		// 統計資料(總和, 平均, 最大, 最小, 個數)
		IntSummaryStatistics stat = scores.stream()
										  .mapToInt(Integer::intValue)
										  .summaryStatistics();
		System.out.println("總和:" + stat.getSum());
		System.out.println("平均:" + stat.getAverage());
		System.out.println("最大:" + stat.getMax());
		System.out.println("最小:" + stat.getMin());
		System.out.println("個數:" + stat.getCount());
		

	}

}
