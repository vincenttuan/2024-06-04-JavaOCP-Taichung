package day19.after;

/**
 * 1 美分 = PENNY
 * 5 美分 = NICKLE
 * 10 美分 = DIME
 * 25 美分 = QUARTER
 * */
public enum USCurrency {
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	
	private int value;
	
	USCurrency(int value) { // enum 建構子的權限一定是 private, 不寫也是 private
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
