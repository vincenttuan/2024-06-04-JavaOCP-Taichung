package day13;

public class PolyDemo2 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		Ostrich ostrich = new Ostrich();
		
		// 多型的應用
		Bird[] birds = {bird, ostrich};
		Animal[] animals = {animal, dog, cat, bird, ostrich};
		
		for(Animal an : animals) {
			an.makeSound();
		}
	}
}
