package day10.case3;

public class Pants extends Product {
	private Integer length; // 褲長

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}
	
	public void displayInfo() {
		System.out.printf("褲子: %s 長度: %s 金額: $%,d%n", getName(), getLength(), getPrice());
	}
}
