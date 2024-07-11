package day12;

public class CoffeeShop {
	public static void main(String[] args) {
		Coffee coffee = new Coffee(50);
		System.out.printf("咖啡價格:$%d%n", coffee.calculatePrice());
		coffee.description();
		
		Latte latte = new Latte(50, 15);
		System.out.printf("拿鐵價格:$%d%n", latte.calculatePrice());
		latte.description();
		
		Mocca mocca = new Mocca(50, 15, 10);
		System.out.printf("摩卡價格:$%d%n", mocca.calculatePrice());
		mocca.description();
	}
}
