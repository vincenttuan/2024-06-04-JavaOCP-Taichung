package day13;

import java.util.Arrays;

public class PolyDemo4 {
	public static void main(String[] args) {
		Animal[] animals = {
				new Dog(), new Cat(), new Bird(), new Ostrich()
		};
		
		// 利用 stream 來分析陣列
		Arrays.stream(animals)
			  .forEach(animal -> animal.makeSound());
		
		long count = Arrays.stream(animals).count();
		System.out.println(count);
		
		// 篩選(過濾)出 Bird
		Arrays.stream(animals)
			  .filter(animal -> animal instanceof Bird) // 過濾出是 Bird 的物件
			  .forEach(animal -> animal.makeSound());
	}
}
