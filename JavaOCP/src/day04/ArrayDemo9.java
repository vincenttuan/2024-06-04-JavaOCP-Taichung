package day04;

//陣列分析的方法
//1. for-loop
//2. for-each
//3. Stream 串流(Java 8 新技術)
public class ArrayDemo9 {

	public static void main(String[] args) {
		int[] scores = {100, 90, 40, 50, 85};
		// 計算出及格的總分
		int sum1 = 0;
		for(int i=0,lens=scores.length ; i<lens ; i++) {
			if(scores[i] >= 60) {
				sum1 += scores[i];
			}
		}
		System.out.printf("及格總分: %d%n", sum1);
		//-------------------------------------------------
		int sum2 = 0;
		for(int score : scores) {
			if(score >= 60) {
				sum2 += score;
			}
		}
		System.out.printf("及格總分: %d%n", sum2);

	}

}
