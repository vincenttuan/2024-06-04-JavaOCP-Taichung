package day13;

// this 與 super 在物件變數(屬性)與方法上的調用
class Father {
	
	int x = 100;
	
	void play() {
		System.out.println("Golf");
	}
}

class Son extends Father {
	
	int x = 200;
	
	void play() {
		System.out.println("LoL");
	}
	
	void printInfo() {
		System.out.println(x); // 200
		play(); // "LoL"
		//-----------------------------------
		System.out.println(this.x); // 200
		this.play(); // "LoL"
		//-----------------------------------
		System.out.println(super.x); // 100
		super.play(); // "Golf"
	}
}

public class MethodDemo {
	public static void main(String[] args) {
		//Son son = new Son();
		//son.printInfo();
		new Son().printInfo();
	}
}
