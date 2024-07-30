package day16;

public class Main5 {
	public static void main(String[] args) {
		Calculate add = (int x, int y) -> {
			return x + y;
		};
		
		Calculate sub = (int x, int y) -> {
			return x - y;
		};
		
		System.out.println(add.calc(5, 3));
		System.out.println(sub.calc(5, 3));
		
	}
}
