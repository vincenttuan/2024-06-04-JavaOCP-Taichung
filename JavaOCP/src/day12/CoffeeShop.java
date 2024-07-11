package day12;

import java.util.Arrays;

public class CoffeeShop {
	public static void main(String[] args) {
		Coffee americano = new Coffee(50);
		System.out.printf("美式價格:$%d%n", americano.calculatePrice());
		americano.description();
		
		Latte latte = new Latte(50, 15);
		System.out.printf("拿鐵價格:$%d%n", latte.calculatePrice());
		latte.description();
		
		Mocca mocca = new Mocca(50, 15, 10);
		System.out.printf("摩卡價格:$%d%n", mocca.calculatePrice());
		mocca.description();
		
		Coffee[] coffees = {americano, latte, mocca};
		int sum = 0;
		for(Coffee coffee : coffees) {
			sum += coffee.calculatePrice();
		}
		System.out.printf("總價:$%d%n", sum);
		
		int sum2 = Arrays.stream(coffees) // [americano, latte, mocca] Stream (物件串流)
						 .mapToInt(coffee -> coffee.calculatePrice()) // [50, 65, 75] intStream (int 串流) 
						 .sum();
		System.out.printf("總價:$%d%n", sum2);
	}
}
