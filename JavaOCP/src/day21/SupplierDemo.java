package day21;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// 利用 Lambda 實現 Supplier (單行實作)
		//Supplier<Date> today = () -> new Date();
		Supplier<Date> today = () -> {return new Date();};
		System.out.println(today.get());
		
		// 利用 Lambda 實現 Supplier (多行實作)
		// yyyy-MM-dd HH:mm:ss 的呈現格式
		Supplier<String> today2 = () -> {
			//String pattern = "HH:mm:ss";
			//String pattern = "yyyy-MM-dd";
			//String pattern = "yyyy-MM-dd HH:mm:ss E";
			//String pattern = "yyyy-MM-dd a hh:mm:ss";
			String pattern = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String todayStr = sdf.format(new Date());
			return todayStr;
		};  
		System.out.println(today2.get());
	}

}
