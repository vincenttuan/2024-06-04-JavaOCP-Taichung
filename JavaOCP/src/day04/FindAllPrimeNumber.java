package day04;

public class FindAllPrimeNumber {

	public static void main(String[] args) {
		// 找出質數並印出
		int[] values = {10, 75, 13, 107, 143, 51};
		for(int i=0, lens=values.length ; i<lens ; i++) {
			int x = values[i];
			boolean isPrime = checkPrime(x);
			if(isPrime) { // 等同 if(isPrime == true)
				System.out.printf("%d 是質數%n", x);
			}
		}
	}
	
	// 判斷是否是質數的方法
	public static boolean checkPrime(int x) {
		boolean isPrime = true; // 預設值
		if(x < 2) {
			return false;
		}
		for(int i=2;i<=x/2;i++) { // 尋找因數
			if(x % i == 0) { // 是否有因數
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
