package day18;

// 外部類別
public class Outer {
	static int sx = 9; // 類別/靜態成員(屬性/欄位)
	
	// 靜態內部類別
	// 不可存取外部的物件成員
	static class Foo {
		int x2 = 77; // 物件成員(屬性/欄位)
		void play() {
			//System.out.println(x); // 不可以存取 x
			System.out.println(x2);
			System.out.println(sx);
		} 
		static void demo() {
			//System.out.println(x); // 不可以存取 x
			//System.out.println(x2); // 不可以存取 x2
			System.out.println(sx);
		}
	}
	
	// 內部類別
	class Bar {
		void test() {
			System.out.println(x);
			System.out.println(sx);
			Foo.demo();
		}
	}
	
	int x = 7; // 物件成員(屬性/欄位)
	
}
