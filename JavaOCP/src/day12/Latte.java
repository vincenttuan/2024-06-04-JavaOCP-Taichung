package day12;

// 子類別 Latte
public class Latte extends Coffee {
	protected int milkPrice; //牛奶價格
	
	// 建構子: 設定/注入咖啡價格, 牛奶價格
	public Latte(int basePrice, int milkPrice) {
		super(basePrice);
		this.milkPrice = milkPrice;
	}
	
	@Override
	public int calculatePrice() { // 計算並得到咖啡+牛奶的價格
		return basePrice + milkPrice;
	}
	
	@Override
	public void description() {
		System.out.println("這是一杯拿鐵咖啡");
	}
}
