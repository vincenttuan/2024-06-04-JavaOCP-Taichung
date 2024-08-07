package day09.case2;

public class Main {

	public static void main(String[] args) {
		Ham ham1 = new Ham("金華", 10.0, 3);
		Ham ham2 = new Ham("東陽", 10.0, 2);
		Egg egg = new Egg(2, 15);
		Rice rice = new Rice(10.0, 1);
		
		System.out.println("素材");
		System.out.printf("%s火腿:%.1f克 每克:$%d%n", ham1.getName(), ham1.getWeight(), ham1.getPrice());
		System.out.printf("%s火腿:%.1f克 每克:$%d%n", ham2.getName(), ham2.getWeight(), ham2.getPrice());
		System.out.printf("雞蛋:%d 顆 每顆:$%d%n", egg.getAmount(), egg.getPrice());
		System.out.printf("米飯:%.1f 克 每克:$%d%n", rice.getWeight(), rice.getPrice());
		System.out.println("-----------------------");
		// 蛋炒飯
		FriedRice eggFriedRice = new FriedRice(egg, rice);
		// 金華火腿蛋炒飯
		FriedRice hamFriedRice = new FriedRice(ham1, egg, rice);
		
		// cook 與計價
		eggFriedRice.cook();
		hamFriedRice.cook();
	}

}
