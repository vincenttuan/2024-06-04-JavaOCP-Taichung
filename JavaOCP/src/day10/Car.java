package day10;

public class Car {
	// 物件變數
	private String model; // 型號
	private String color; // 顏色
	private Integer maxSpeed; // 最高速度
	
	public Car(String model, String color, Integer maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void displayInfo() {
		System.out.printf("型號:%s 顏色:%s 最高速度:%d%n", model, color, maxSpeed);
	}
	
}
