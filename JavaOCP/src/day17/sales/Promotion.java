package day17.sales;

//銷售策略
public class Promotion {
	private int x; // 買 x
	private int y; // 送 y
	
	public Promotion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// 計算要付幾瓶的私有方法(演算法)
	public int getBottles(int amount) {
		// 計算要支付費用的瓶數 
		int bottles = amount / (x+y) * x + amount % (x+y);
		return bottles;
	}
	
}
