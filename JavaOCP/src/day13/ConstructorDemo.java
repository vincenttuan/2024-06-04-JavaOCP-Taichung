package day13;

// 建構子 this() 與 super() 調用
class Foo {
	
	Foo() {
		this(100);
		System.out.println("A");
	}

	Foo(char c) {
		this();
		System.out.println(c);
	}
	
	Foo(int x) {
		System.out.println(x);
	}
}

class Bar {
	Bar(char c) {
		System.out.println('C');
	}
	Bar() {
		this('B');
	}
}


public class ConstructorDemo {

	public static void main(String[] args) {
		Foo foo = new Foo('B');
		//Bar bar = new Bar();
	}

}
