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
		
		// 問題: 很多重複變數與重複的演算法程式碼
		// ----------------------------------------------------------
		int x2 = 2; // 買
		int y2 = 1; // 送
		int price2 = 12; // 飲料價格
		int amount2 = 7; // 買入數量
		
		// 計算要支付費用的瓶數 
		int bottles2 = amount2 / (x2+y2) * x2 + amount2 % (x2+y2);
		
		// 計算費用
		int total2 = bottles2 * price2;
		System.out.println(total2);
		
	}
}
