package day13;

// 建構子 this() 與 super() 調用
class Foo {
	Foo(char c) {
		this();
		System.out.println(c);
	}
	Foo() {
		System.out.println("A");
	}
}

class Bar extends Foo {
	Bar(char c) {
		super(c);
		System.out.println('C');
	}
}


public class ConstructorDemo {

	public static void main(String[] args) {
		Bar bar = new Bar('B');
	}

}
