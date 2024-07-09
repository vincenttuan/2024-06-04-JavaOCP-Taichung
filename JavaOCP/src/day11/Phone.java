package day11;

public class Phone {

	private String brand; // 品牌：描述手機的製造商，如 Apple, Samsung。

	private String model; // 型號：描述手機的具體型號，如 iPhone 14, Galaxy S21。
	
	// 父類別的建構子
	public Phone() {
	}
	
	// 父類別的建構子：初始化品牌和型號
	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	// 打電話的方法: 模擬撥打電話的功能
	public void makeCall(String number) {
		System.out.printf("%s %s Calling: %s%n", brand, model, number);
	}

}
