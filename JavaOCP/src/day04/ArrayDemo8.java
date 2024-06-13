package day04;

// 陣列分析的方法
// 1. for-loop
// 2. for-each
// 3. Stream 串流(Java 8 新技術)
public class ArrayDemo8 {

	public static void main(String[] args) {
		int[] scores = {100, 90, 85};
		// 計算總分
		// 1. for-loop
		int sum1 = 0;
		for(int i=0, lens=scores.length ; i<lens ; i++) {
			sum1 += scores[i];
		}
		System.out.printf("總分: %d%n", sum1);
		
		// 2. for-each
		int sum2 = 0;
		for(int score : scores) {
			sum2 += score;
		}
		System.out.printf("總分: %d%n", sum2);
		
		
	}

}
