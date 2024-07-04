package day10.case3;

public class Shoes extends Product {
	private String color; // 顏色 

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void displayInfo() {
		System.out.printf("鞋子: %s 顏色: %s 金額: $%,d%n", getName(), getColor(), getPrice());
	}
}
