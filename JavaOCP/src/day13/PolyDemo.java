package day13;

// 多型應用
class Animal {
	public void makeSound() {
		System.out.println("某種動物的叫聲");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("狗叫: 汪汪");
	}
	public void fetch() {
		System.out.println("狗會撿回物品");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("貓叫: 喵喵");
	}
	public void scratch() {
		System.out.println("貓在抓東西");
	}
}

class Bird extends Animal {
	@Override
	public void makeSound() {
		System.out.println("鳥叫: 啾啾");
	}
	public void fly() {
		System.out.println("鳥會飛");
	}
}

class Ostrich extends Bird {
	@Override
	public void makeSound() {
		System.out.println("鴕鳥: 低沉的鳴叫");
	}
	@Override
	public void fly() {
		System.out.println("鴕鳥不會飛");
	}
	public void run() {
		System.out.println("鴕鳥會跑");
	}
}

public class PolyDemo {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.makeSound();
		// 利用轉型來調用 Dog 專屬成員
		((Dog)dog).fetch();
		
		Animal cat = new Cat();
		cat.makeSound();
		// 利用轉型來調用 Cat 專屬成員
		((Cat)cat).scratch();
		
		// 狗轉貓
		if(dog instanceof Cat) {
			((Cat)dog).makeSound();
			((Cat)dog).scratch();
		} else {
			System.out.println("dog 不可轉 Cat");
		}
		
		Bird bird1 = new Bird();
		Bird bird2 = new Ostrich();
		bird1.makeSound();
		bird1.fly();
		bird2.makeSound();
		bird2.fly();
		if(bird2 instanceof Ostrich) {
			((Ostrich)bird2).run();
		}
		// 得到該物件實際的型態
		System.out.println(bird1.getClass().getSimpleName());
		System.out.println(bird2.getClass().getSimpleName());
		
	}
}
