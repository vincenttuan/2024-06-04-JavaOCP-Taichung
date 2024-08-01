package day17.sales;

public class Main {
	public static void main(String[] args) {
		// 商品
		Product blackTea = new Product(10, "紅茶");
		Product greenTea = new Product(12, "綠茶");
		Product oolongTea = new Product(15, "烏龍茶");
		
		// 銷售策略(含演算法)
		Promotion promotion1 = new Promotion(2, 1);
		Promotion promotion2 = new Promotion(5, 3);
		Promotion promotion3 = new Promotion(1, 1);
		
		// 銷售(針對商品與銷售策略)
		SalesAlgorithm sa1 = new SalesAlgorithm(blackTea, promotion2, 20);
		sa1.printBill();
		
	}
}
