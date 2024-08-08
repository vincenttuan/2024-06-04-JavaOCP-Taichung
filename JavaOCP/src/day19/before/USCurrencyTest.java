package day19.before;

public class USCurrencyTest {

	public static void main(String[] args) {
		USCurrency penny = new USCurrency(1);
		System.out.println("penny 是 " + penny.getValue() + " 美分");
		USCurrency dime = new USCurrency(10);
		System.out.println("dime 是 " + dime.getValue() + " 美分");
		
	}

}
