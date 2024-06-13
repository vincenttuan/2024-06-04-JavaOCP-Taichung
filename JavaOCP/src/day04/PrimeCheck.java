package day04;

public class PrimeCheck {

	public static void main(String[] args) {
		// 找出質數
		// int[] values = {10, 75, 13, 143, 51};
		
		// 除了 1 與自己之外, x 有哪些因數
		int x = 51;
		for(int i=2 ; i<=x/2 ; i++) {
			if(x % i == 0) {
				System.out.printf("%d 是 %d 的因數%n", i, x);
			}
		}
		
		// x 是否是質數
		boolean isPrime = true; // 假設是質數
		for(int i=2 ; i<=x/2 ; i++) {
			if(x % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.printf("%d 是質數? %b%n", x, isPrime);
		
	}

}
