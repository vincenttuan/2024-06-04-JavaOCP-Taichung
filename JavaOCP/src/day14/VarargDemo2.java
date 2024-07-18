package day14;

import java.util.Arrays;

public class VarargDemo2 {
	
	// 購物車
	public static void cart(String... products) {
		System.out.println("購物車裡面有:");
		Arrays.stream(products)
			  .forEach(product -> System.out.println(product));
	}
	
	public static void main(String[] args) {
		
		cart("化妝品", "鉛筆", "零食");
		cart("電腦", "手機");
		
		
	}

}
