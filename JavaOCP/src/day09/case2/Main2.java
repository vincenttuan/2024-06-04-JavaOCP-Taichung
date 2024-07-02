package day09.case2;

public class Main2 {
	public static void main(String[] args) {
		// 素材
		Ham ham1 = new Ham("金華", 10.0, 3);
		Ham ham2 = new Ham("東陽", 10.0, 2);
		Egg egg = new Egg(2, 15);
		Rice rice = new Rice(10.0, 1);
		
		// 點餐
		// 3份蛋炒飯 + 2份金華火腿蛋炒飯 + 1份東陽火腿蛋炒飯 = ? 元
		FriedRice f3 = new FriedRice(egg, rice);
		FriedRice f2 = new FriedRice(ham1, egg, rice);
		FriedRice f1 = new FriedRice(ham2, egg, rice);
		
		double total = f3.getPrice() * 3 +
					   f2.getPrice() * 2 +
					   f1.getPrice() * 1;
		System.out.println(total);
		
	}
}
