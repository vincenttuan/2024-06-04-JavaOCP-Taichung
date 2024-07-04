package day10;

public class Car {
	// 物件變數
	private String model; // 型號
	private String color; // 顏色
	private Integer maxSpeed; // 最高速度
	private Integer price; // 價格
	// 類別變數(靜態變數) 
	static int totalCars; // 用於計算所有創建的汽車總數  
	static double discountRate = 1.0; // 用於計算統一折扣
	
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
	
}
