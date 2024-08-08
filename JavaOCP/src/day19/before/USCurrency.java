package day19.before;

/**
 * 1 美分 = PENNY
 * 5 美分 = NICKLE
 * 10 美分 = DIME
 * 25 美分 = QUARTER
 * */
public class USCurrency {
	private int value;
	
	public USCurrency(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
