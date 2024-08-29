package day25;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ParallelDemo {

	public static void main(String[] args) {
		// 循序運算(印出每一個元素的平方)
		List<Integer> nums = List.of(2, 4, 6, 8, 10);
		nums.stream()
			.sequential() // 預設(循序流)可以不用寫
			.mapToInt(n -> n * n)
			.forEach(n -> System.out.println(n));
		
		System.out.println("------");
		
		// 平行運算
		int parallelism = ForkJoinPool.getCommonPoolParallelism();
		System.out.printf("此電腦可以同步執行的任務數量(並行度): %d%n", parallelism);
		nums.parallelStream()
			.mapToInt(n -> n * n)
			.forEach(n -> System.out.println(n));
	}

}
