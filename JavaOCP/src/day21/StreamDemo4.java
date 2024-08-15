package day21;

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

	}

}
