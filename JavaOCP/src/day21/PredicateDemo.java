package day21;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		// 利用 Lambda 實現 Predicate
		//Predicate<Double> predicate1 = (Double score) -> score >= 60;
		Predicate<Double> predicate1 = (score) -> score >= 60;
		System.out.println(predicate1.test(85.0));
		System.out.println(predicate1.test(45.0));
		
	}
}
