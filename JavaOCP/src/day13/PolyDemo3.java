package day13;

public class PolyDemo3 {
	
	// 任意取得一個動物
	public static Animal getAnimal(int i) {
		switch (i) {
			case 1:
				//return new Dog();
				Dog dog = new Dog();
				return dog;
			case 2:
				return new Cat();
			case 3:
				return new Bird();
			case 4:
				return new Ostrich();
		}
		return new Animal();
	}
	
	public static void main(String[] args) {
		Animal animal = getAnimal(1);
		animal.makeSound();
		System.out.println(animal.getClass().getName());
		System.out.println(animal.getClass().getSimpleName());
		if(animal instanceof Dog) {
			((Dog)animal).fetch();
		}
	}
}
