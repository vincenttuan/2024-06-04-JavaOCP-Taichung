package day07;

import java.util.Arrays;
import static java.lang.System.out;

public class WrapperDemo4 {

	public static void main(String[] args) {
		Integer[] scores = {100, null, 90, null, 80}; // Auto-Boxing
		// 計算總分: for-each
		int sum = 0;
		for(Integer score : scores) { 
			if(score == null) {
				continue;
			}
			sum += score; // Auto-Unboxing
		}
		System.out.println(sum);
		
		// 計算總分: Stream
		int sum2 =  Arrays.stream(scores) // Integer 串流
						  .filter(score -> score != null) // Integer 串流
						  //.mapToInt(score -> score.intValue()) // int 串流: IntStream
						  //.mapToInt(score -> score) // int 串流: IntStream + Auto-Unboxing
						  .mapToInt(Integer::intValue) // 利用方法參考::
						  .sum();
		System.out.println(sum2);
		
		// 印出所有有註冊的分數
		Arrays.stream(scores)
			  .filter(score -> score != null)
			  //.forEach(score -> System.out.println(score));
			  //.forEach(System.out::println);
			  .forEach(out::println);
		
	}

}
