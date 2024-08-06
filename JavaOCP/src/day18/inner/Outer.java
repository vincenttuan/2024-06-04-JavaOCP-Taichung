package day18.inner;

// 外部類
public class Outer {
	private int x = 7;
	private static int sx = 9;
	
	// 一般內部類(不可以有 static 成員)
	public class Inner {
		private int x = 77;
		public void callMe() {
			int x = 777;
			System.out.println(x); // 777
			System.out.println(this.x); // 77
			System.out.println(Outer.this.x); // 7
			System.out.println(Outer.sx); // 9
		}
	}
}
