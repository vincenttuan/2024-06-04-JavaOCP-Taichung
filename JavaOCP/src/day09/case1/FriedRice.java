package day09.case1;

// 炒飯
public class FriedRice {
	private double hamAmount; // 火腿的重量(g)
	private int eggAmount; // 蛋的數量(個)
	private double rice;      // 米的容量(杯)
	
	// 建構子封裝
	public FriedRice() {
		
	}
	
	public FriedRice(double hamAmount, int eggAmount, double rice) {
		this.hamAmount = hamAmount;
		this.eggAmount = eggAmount;
		this.rice = rice;
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

	public double getRice() {
		return rice;
	}

	public void setRice(double rice) {
		this.rice = rice;
	}
	
	
	
	
}
