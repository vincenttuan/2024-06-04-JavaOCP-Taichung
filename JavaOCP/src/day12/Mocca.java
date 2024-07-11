package day12;

public class Mocca extends Latte {
	private int chocolatePrice;
	
	public Mocca(int basePrice, int milkPrice, int chocolatePrice) {
		super(basePrice, milkPrice);
		this.chocolatePrice = chocolatePrice;
	}

	@Override
	public int calculatePrice() {
		return basePrice + milkPrice + chocolatePrice;
	}

	@Override
	public void description() {
		System.out.println("這是一杯摩卡咖啡");
	}
	
}
