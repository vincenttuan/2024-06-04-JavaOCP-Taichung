package day09.case2;

public class Main {

	public static void main(String[] args) {
		Ham ham1 = new Ham("金華", 10.0, 3);
		Ham ham2 = new Ham("新東陽", 10.0, 2);
		Egg egg = new Egg(2, 15);
		Rice rice = new Rice(10.0, 1);
		
		System.out.println("素材");
		System.out.printf("%s火腿 %.1f克 每克 $%d 元%n", ham1.getName(), ham1.getWeight(), ham1.getPrice());
		System.out.printf("%s火腿 %.1f克 每克 $%d 元%n", ham2.getName(), ham2.getWeight(), ham2.getPrice());
		System.out.printf("雞蛋 %d 顆 每顆 %d 元%n", egg.getAmount(), egg.getPrice());
		System.out.printf("米飯 %.1f 克 每克 %d 元%n", rice.getWeight(), rice.getPrice());
		

	}

}
