package day19.after;

public class USCurrencyTest {

	public static void main(String[] args) {
		USCurrency penny = USCurrency.PENNY;
		System.out.println("penny 是 " + penny.getValue() + " 美分");
		USCurrency dime = USCurrency.DIME;
		System.out.println("dime 是 " + dime.getValue() + " 美分");
	}

}
