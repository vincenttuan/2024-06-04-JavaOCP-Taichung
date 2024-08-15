package day21;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamDemo {
	public static void main(String[] args) {
		// List.of ImmutableCollections 不可變集合
		List<Integer> scores = List.of(100, 40, 80);
		scores.forEach((t) -> System.out.println(t));
		System.out.println("------");
		
		scores.stream()  // 轉串流是為了可以進行分析
			  .forEach(t -> System.out.println(t));
		System.out.println("------");
		
		scores.stream()  // 轉串流是為了可以進行分析
			  .filter((score) -> score >= 60)  // 過濾成績
		  	  .forEach(score -> System.out.println(score));
		System.out.println("------");
		
		scores.stream()  // 轉串流是為了可以進行分析
			  .filter((score) -> score >= 60)  // 過濾成績
			  .forEach(System.out::println);  // 方法參考 ::
		System.out.println("------");
		
		Predicate<Integer> passScore = (score) -> score >= 60;
		Consumer<Integer> printScore = (score) -> System.out.println(score);
		//Consumer<Integer> printScore = System.out::println;
		scores.stream()
			  .filter(passScore)
			  .forEach(printScore);
			  
	}
}
