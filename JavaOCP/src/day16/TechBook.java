package day16;

public class TechBook implements Book {
	private String name;
	private Integer price;
	
	public TechBook(String name, Integer price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getPrice() {
		return price;
	}
	

}
