package day17;

// 演算法
public class Algorithm {
	public static void main(String[] args) {
		// 買 x 送 y
		// 銷售策略
		int x = 3; // 買
		int y = 1; // 送
		int price = 10; // 飲料價格
		int amount = 5; // 買入數量
		
		// 計算要支付費用的瓶數 
		int bottles = amount / (x+y) * x + amount % (x+y);
		
		// 計算費用
		int total = bottles * price;
		
		System.out.println(total);
		
		
	}
}
