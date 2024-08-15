package day21;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer1 = new Consumer<>() {
			@Override
			public void accept(Integer t) {
				System.out.println("數字:" + t);
			}
		};
		
		// Java 7 之後可以透過 <> 來自動推斷為 <String>
		Consumer<String> consumer2 = new Consumer<>() {
			@Override
			public void accept(String t) {
				System.out.println("字串:" + t);
			}
		};
		
		consumer1.accept(10); // 放入整數參數
		consumer2.accept("Java"); // 放入字串參數
		

	}

}
