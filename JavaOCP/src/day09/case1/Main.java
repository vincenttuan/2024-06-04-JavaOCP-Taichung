package day09.case1;

public class Main {

	public static void main(String[] args) {
		FriedRice friedRice1 = new FriedRice();
		friedRice1.setHamAmount(10.5);
		friedRice1.setEggAmount(3);
		friedRice1.setRiceAmount(0.5);
		friedRice1.cook();
		
		FriedRice friedRice2 = new FriedRice(12.5, 4, 1.2);
		friedRice2.cook();
	}

}
