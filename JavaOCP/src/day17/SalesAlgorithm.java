package day17;

public class SalesAlgorithm {
	private int x; // 策略: 買幾
	private int y; // 策略: 送幾
	private int price; // 商品: 價格
	private String name; // 商品: 名稱
	private int amount; // 銷售: 數量
	
	public SalesAlgorithm(int x, int y, int price, String name, int amount) {
		this.x = x;
		this.y = y;
		this.price = price;
		this.name = name;
		this.amount = amount;
	}
	
	// 應付金額
	public int getTotal() {
		int total = getBottles() * price;
		return total;
	}
	
	// 列印帳單明細
	public void printBill() {
		System.out.printf("%s飲料: %d 元 (買 %d 送 %d) 總共買: %d 瓶 應付: %d 元%n",
				name, price, x, y, amount, getTotal());
	}
	
	// 計算要付幾瓶的私有方法(演算法)
	private int getBottles() {
		// 計算要支付費用的瓶數 
		int bottles = amount / (x+y) * x + amount % (x+y);
		return bottles;
	}
	
}
