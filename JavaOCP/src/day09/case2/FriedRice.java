package day09.case2;

// 炒飯類(組合)
public class FriedRice {
	private Ham ham;
	private Egg egg;
	private Rice rice;
	
	// 建構子:火腿蛋炒飯
	public FriedRice(Ham ham, Egg egg, Rice rice) {
		this.ham = ham;
		this.egg = egg;
		this.rice = rice;
	}
	
	// 建構子:蛋炒飯
	public FriedRice(Egg egg, Rice rice) {
		this.egg = egg;
		this.rice = rice;
	}
	
	
}
