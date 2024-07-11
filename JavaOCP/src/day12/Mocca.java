package day12;

public class Mocca extends Coffee {
	private int chocolatePrice;
	
	public Mocca(int basePrice, int chocolatePrice) {
		super(basePrice);
		this.chocolatePrice = chocolatePrice;
	}

	@Override
	public int calculatePrice() {
		return basePrice + chocolatePrice;
	}

	@Override
	public void description() {
		System.out.println("這是一杯摩卡咖啡");
	}
	
	
	
}
