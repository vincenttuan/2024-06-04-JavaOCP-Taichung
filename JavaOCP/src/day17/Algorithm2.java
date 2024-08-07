package day17;

public class Algorithm2 {
	// 買 x 送 y
	// 銷售策略
	static int x = 1; // 買
	static int y = 1; // 送
	
	static int getBottles(int amount) {
		// 計算要支付費用的瓶數 
		int bottles = amount / (x+y) * x + amount % (x+y);
		return bottles;
	}
	
	public static void main(String[] args) {
		x = 3;
		y = 1;
		int price = 10; // 飲料價格
		int amount = 5; // 買入數量
		// 支付費用的瓶數
		int bottles = getBottles(amount);
		// 計算費用
		int total = bottles * price;
		System.out.println(bottles + ", $" + total);
		
		// 因為變數共用, 無法保留之前買幾送幾的狀態
		//-----------------------------------------------
		x = 5;
		y = 3;
		int price2 = 15;
		int amount2 = 15;
		int bottles2 = getBottles(amount2);
		int total2 = bottles2 * price2;
		System.out.println(bottles2 + ", $" + total2);
		
	}
}
