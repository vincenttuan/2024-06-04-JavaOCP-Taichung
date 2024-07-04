package day10;

public class Car {
	// 物件變數
	private String model; // 型號
	private String color; // 顏色
	private Integer maxSpeed; // 最高速度
	private Integer price; // 價格
	// 類別變數(靜態變數) 
	private static int totalCars; // 用於計算所有創建的汽車總數  
	private static double discountRate; // 用於計算統一折扣
	
	public Car(String model, String color, Integer maxSpeed, Integer price) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
		totalCars++; // 每創建一台車, 總數+1
	}
	
	public void displayInfo() {
		System.out.printf("型號:%s 顏色:%s 最高速度:%d 售價:%d 折扣價:%.0f%n", 
				model, color, maxSpeed, price, (price * discountRate));
	}
	
	// 設計一個可以變更類別變數的類別方法
	public static void setDiscountRate(double discountRate) {
		if(discountRate < 0 || discountRate >= 1) {
			return;
		}
		Car.discountRate = discountRate;
	}
	
	public static int getTotalCars() {
		return totalCars; // Car.totalCars
	}
	
}
