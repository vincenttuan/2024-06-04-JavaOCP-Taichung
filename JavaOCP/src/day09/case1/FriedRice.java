package day09.case1;

// 炒飯
public class FriedRice {
	private double hamAmount; // 火腿的重量(g)
	private int eggAmount; // 蛋的數量(個)
	private double riceAmount;      // 米的容量(杯)
	
	// 建構子封裝
	public FriedRice() {
		
	}
	
	public FriedRice(double hamAmount, int eggAmount, double riceAmount) {
		this.hamAmount = hamAmount;
		this.eggAmount = eggAmount;
		this.riceAmount = riceAmount;
	}
	
	// 方法封裝
	public double getHamAmount() {
		return hamAmount;
	}

	public void setHamAmount(double hamAmount) {
		this.hamAmount = hamAmount;
	}

	public int getEggAmount() {
		return eggAmount;
	}

	public void setEggAmount(int eggAmount) {
		this.eggAmount = eggAmount;
	}

	public double getRiceAmount() {
		return riceAmount;
	}

	public void setRiceAmount(double riceAmount) {
		this.riceAmount = riceAmount;
	}
	
	// 炒飯邏輯
	public void cook() {
		System.out.println("準備開始炒火腿蛋炒飯");
		System.out.printf("火腿: %.1f 克%n", hamAmount);
		System.out.printf("雞蛋: %d 顆%n", eggAmount);
		System.out.printf("米飯: %.1f 杯%n", riceAmount);
		System.out.println("開始炒...");
		System.out.println("火腿蛋炒飯完成");
	}
	
	
}
