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
		((Cat)dog).makeSound();
		((Cat)dog).scratch();
		
	}
}
