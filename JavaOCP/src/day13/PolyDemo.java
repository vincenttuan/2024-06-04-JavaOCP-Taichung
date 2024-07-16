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

}
