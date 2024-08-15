package day21;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// 利用 Lambda 實現 Supplier
		Supplier<Date> today = () -> new Date();
		System.out.println(today.get());
		
		
	}

}
