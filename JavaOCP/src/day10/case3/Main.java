package day10.case3;

public class Main {

	public static void main(String[] args) {
		Clothing clothing = new Clothing();
		Pants pants = new Pants();
		Shoes shoes = new Shoes();
		
		clothing.setName("冰鋒衣");
		clothing.setPrice(800);
		clothing.setSize("L");
		
		pants.setName("牛仔褲");
		pants.setPrice(1000);
		pants.setLength(110);
		
		shoes.setName("洞洞鞋");
		shoes.setPrice(500);
		shoes.setColor("白");
		
		System.out.printf("衣服: %s 尺寸: %s 金額: $%,d%n", clothing.getName(), clothing.getSize(), clothing.getPrice());
		System.out.printf("褲子: %s 長度: %s 金額: $%,d%n", pants.getName(), pants.getLength(), pants.getPrice());
		System.out.printf("鞋子: %s 顏色: %s 金額: $%,d%n", shoes.getName(), shoes.getColor(), shoes.getPrice());
		
		clothing.displayInfo(); // 印出 => 衣服: 冰鋒衣 尺寸: L 金額: $800
		pants.displayInfo(); // 褲子: 牛仔褲 長度: 110 金額: $1,000
		shoes.displayInfo(); // 鞋子: 洞洞鞋 顏色: 白 金額: $500
		
	}

}
