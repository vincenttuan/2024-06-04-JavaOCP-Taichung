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
	
	// 取得炒飯的價格
	public Double getPrice() {
		if(ham == null) {
			return egg.getAmount() * egg.getPrice() +
				   rice.getWeight() * rice.getPrice();
		} else {
			return ham.getWeight() * ham.getPrice() +
				   egg.getAmount() * egg.getPrice() +
				   rice.getWeight() * rice.getPrice();
		}
	}
	
	public void cook() {
		// 印出炒飯的種類與價格
		if(ham == null) { // 沒有火腿-蛋炒飯
			double price = egg.getAmount() * egg.getPrice() +
						   rice.getWeight() * rice.getPrice();
			
			System.out.printf("蛋炒飯 $%.0f%n", price);
		} else { // 有火腿-火腿蛋炒飯
			double price = ham.getWeight() * ham.getPrice() +
						   egg.getAmount() * egg.getPrice() +
					   	   rice.getWeight() * rice.getPrice();
			
			System.out.printf("%s火腿蛋炒飯 $%.0f%n", ham.getName(), price);
		}
	}
	
}
