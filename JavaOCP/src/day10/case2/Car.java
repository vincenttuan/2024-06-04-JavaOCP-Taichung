package day10.case2;

public class Car {
	// 物件變數
	private String model; // 型號
	private String color; // 顏色
	private Integer maxSpeed; // 最高速度
	private Integer price; // 價格
	
	// 建構子
	public Car(String model, String color, Integer maxSpeed, Integer price) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
		// 每創建一台車, 總數+1
		CarUtil.addTotalCars();
	}
	
	public void displayInfo() {
		System.out.printf("型號:%s 顏色:%s 最高速度:%d 售價:%d 折扣價:%.0f%n", 
				model, color, maxSpeed, price, (price * CarUtil.getDiscountRate()));
	}
	
}
