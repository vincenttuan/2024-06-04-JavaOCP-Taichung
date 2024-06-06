package day02;

public class BevCalUtil {
	// 定義每一種飲料每100ml(千卡)
	private static double coffeeCalPer100ml = 2.0;
	private static double teaCalPer100ml = 1.0;
	private static double sodaCalPer100ml = 40.0;
	private static double juiceCalPer100ml = 45.0;
	
	// 定義熱量文字
	private static String lowCal = "低熱量";
	private static String medCal = "中熱量";
	private static String highCal = "高熱量";
	
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
	
	// 根據熱量進行分類
	public static String getCalLevel(double cal) {
		String calLevel = medCal; // 預設值
		if(cal >= 100) {
			calLevel = highCal;
		} else if(cal < 50) {
			calLevel = lowCal;
		}
		return calLevel;
	}
	
	// 印出飲料熱量的相關資訊
	public static void printCal(String bevType, double ml, double cal, String calLevel) {
		System.out.printf("飲料種類: %s 容量: %.1f 毫升 熱量: %.1f 千卡 熱量分類: %s%n",
				bevType, ml, cal, calLevel);
	} 
	
}
