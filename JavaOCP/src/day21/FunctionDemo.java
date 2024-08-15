package day21;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// 利用 Lambda 來實現 Function
		Function<Integer, Double> function1 = (Integer r) -> Math.pow(r, 2) * Math.PI;
		System.out.println(function1.apply(10));
		System.out.println(function1.apply(20));
		
	}

}
