package day10.case3;

public class Clothing extends Product {
	private String size; // 尺寸

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public void displayInfo() {
		System.out.printf("衣服: %s 尺寸: %s 金額: $%,d%n", getName(), getSize(), getPrice());
	}
	
}
