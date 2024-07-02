package day09.case1;

public class Main2 {

	public static void main(String[] args) {
		FriedRice friedRice = new FriedRice();
		friedRice.cook();
		System.out.println(friedRice);
		
		System.out.println("-----------------");
		
		FriedRice friedRice2 = friedRice;
		friedRice2.cook();
		System.out.println(friedRice2);
		
	}

}
