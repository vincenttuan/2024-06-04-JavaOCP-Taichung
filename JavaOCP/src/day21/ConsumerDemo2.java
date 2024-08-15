package day21;

import java.util.function.Consumer;

public class ConsumerDemo2 {

	public static void main(String[] args) {
		// 利用 Lambda 來實現
		//Consumer<Integer> consumer1 = (Integer t) -> System.out.println("數字:" + t);
		//Consumer<String> consumer2 = (String t) -> System.out.println("字串:" + t);
		Consumer<Integer> consumer1 = (t) -> System.out.println("數字:" + t);
		Consumer<String> consumer2 = (t) -> System.out.println("字串:" + t);
		//Consumer<Integer> consumer1 = t -> System.out.println("數字:" + t);
		//Consumer<String> consumer2 = t -> System.out.println("字串:" + t);
		
		consumer1.accept(10);
		consumer2.accept("Java");
	}

}
