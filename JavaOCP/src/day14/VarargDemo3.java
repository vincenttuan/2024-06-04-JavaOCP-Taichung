package day14;

class Calc {
	private int sum;
	
	Calc(int... values) {
		for(int x : values) {
			sum += x;
		}
	}
	
	public int getSum() {
		return sum;
	}
}

public class VarargDemo3 {
	public static void main(String[] args) {
		Calc c1 = new Calc(1, 2, 3);
		System.out.println(c1.getSum());
		
		Calc c2 = new Calc(1, 2, 3, 4);
		System.out.println(c2.getSum());
		
	}
}
