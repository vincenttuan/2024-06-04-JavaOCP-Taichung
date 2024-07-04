package day10.case2;

// 類別: 功能服務
public class CarUtil {
	// 類別變數(靜態變數) 
	private static int totalCars; // 用於計算所有創建的汽車總數  
	private static double discountRate; // 用於計算統一折扣
	
	public static int getTotalCars() {
		return totalCars;
	}
	
	public static void addTotalCars() {
		CarUtil.totalCars++;
	}
	
	public static double getDiscountRate() {
		return discountRate;
	}
	
	public static void setDiscountRate(double discountRate) {
		CarUtil.discountRate = discountRate;
	}
}
