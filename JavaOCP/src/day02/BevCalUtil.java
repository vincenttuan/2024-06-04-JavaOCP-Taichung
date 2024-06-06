package day02;

public class BevCalUtil {
	// 定義每一種飲料每100ml(千卡)
	public static double coffeeCalPer100ml = 2.0;
	public static double teaCalPer100ml = 1.0;
	public static double sodaCalPer100ml = 40.0;
	public static double juiceCalPer100ml = 45.0;
	
	// 定義熱量文字
	public static String lowCal = "低熱量";
	public static String medCal = "中熱量";
	public static String highCal = "高熱量";
	
	// 根據飲料的類型與容量來計算熱量
	public static double getCal(String bevType, double ml) {
		double calPer100ml = 0; // 預設值
		switch(bevType) {
			case "coffee":
				calPer100ml = ml * coffeeCalPer100ml;
				break;
			case "tea":
				calPer100ml = ml * teaCalPer100ml;
				break;
			case "soda":
				calPer100ml = ml * sodaCalPer100ml;
				break;
			case "juice":
				calPer100ml = ml * juiceCalPer100ml;
				break;	
		}
		
		return calPer100ml;
	}
	
}
