package day14;

import java.util.Arrays;

public class VarargDemo2 {
	
	// 購物車 1
	public static void cart() {
		System.out.println("購物車裡面沒有商品");
	}
	
	// 購物車 2
	public static void cart(String... products) {
		System.out.println("購物車裡面有:");
		Arrays.stream(products)
			  .forEach(product -> System.out.println(product));
	}
	
	public static void main(String[] args) {
		
		cart("化妝品", "鉛筆", "零食", "筆筒");
		cart("化妝品", "鉛筆", "零食");
		cart("電腦", "手機");
		cart("信紙");
		cart();
		
	}

}
