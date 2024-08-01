package day17;

public class Algorithm3 {
	
	public static void main(String[] args) {
		SalesAlgorithm sa1 = new SalesAlgorithm(3, 2, 10, 15);
		SalesAlgorithm sa2 = new SalesAlgorithm(5, 3, 12, 22);
		sa1.printBill();
		sa2.printBill();
	}
}
