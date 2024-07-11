package day12;

public class CoffeeShop {
	public static void main(String[] args) {
		Coffee coffee = new Coffee(50);
		System.out.printf("咖啡價格:$%d%n", coffee.calculatePrice());
		coffee.description();
		
		
	}
}
