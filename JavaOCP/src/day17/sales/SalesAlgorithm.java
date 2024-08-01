package day17.sales;

// 定義銷售演算法, 負責列印費用與印帳單
public class SalesAlgorithm {
	private Product product; // 商品
	private Promotion promotion; // 銷售策略
	private int amount; // 購買的總數量
	
	public SalesAlgorithm(Product product, Promotion promotion, int amount) {
		this.product = product;
		this.promotion = promotion;
		this.amount = amount;
	}
	
	// 計算應付的總金額
	public int getTotal() {
		// 計算應付的數量
		int bottles = promotion.getBottles(amount);
		return bottles * product.getPrice();
	}
	
	// 列印帳單
	public void printBill() {
		System.out.printf("%s飲料促銷: 買 %d 送 %d%n", product.getName(), promotion.getX(), promotion.getY());
		System.out.printf("%s每瓶價格: %d%n", product.getPrice());
		System.out.printf("總購買數量: %d 瓶%n", amount);
		System.out.printf("應付金額: %d 元%n", getTotal());
		
	}
	
}
