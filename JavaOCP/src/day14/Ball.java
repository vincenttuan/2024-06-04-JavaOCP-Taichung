package day14;

public class Ball {
	private String color;
	private int price;
	
	public Ball(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + ", price=" + price + "]";
	}
	
}