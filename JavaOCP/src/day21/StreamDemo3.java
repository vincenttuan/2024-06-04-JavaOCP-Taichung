package day21;

import java.util.List;

public class StreamDemo3 {
	public static void main(String[] args) {
		List<String> scores = List.of("100", "40", "70", "50", "85");
		// 請印出及格分數
		scores.stream()
			  .filter(score -> Integer.parseInt(score) >= 60) 
			  .forEach(System.out::println);
		
		System.out.println("--------");
		
		scores.stream()
			  //.map(score -> Integer.parseInt(score))  // 轉 Integer
			  .map(Integer::parseInt)  // 轉 Integer
			  .filter(score -> score >= 60)
			  .forEach(System.out::println);
		
	}
}
