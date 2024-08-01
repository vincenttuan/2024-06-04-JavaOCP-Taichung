package day17.sales;
//商品
public class Product {
	private int price;
	private String name;
	
	public Product(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	
}
