package day17;

public class Algorithm3 {
	
	public static void main(String[] args) {
		SalesAlgorithm sa1 = new SalesAlgorithm(3, 2, 10, "紅茶", 15);
		SalesAlgorithm sa2 = new SalesAlgorithm(5, 3, 12, "綠茶", 22);
		SalesAlgorithm sa3 = new SalesAlgorithm(3, 2, 18, "烏龍茶", 50);
		
		sa1.printBill();
		sa2.printBill();
		sa3.printBill();
		
		
	}
}
