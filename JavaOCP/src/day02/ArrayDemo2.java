package day02;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] scores = {100, 75, 53, 98, 41};
		
		// 印出每一個陣列元素
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		System.out.println("-----"); // 分隔線
		
		// 寫一個 for-loop 印出每一個陣列元素
		for(int i=0;i<=4;i++) { // i 用來表示維度
			System.out.println(scores[i]);
		}
		System.out.println("-----"); // 分隔線
		
		for(int i=0;i<scores.length;i++) { // i 用來表示維度
			System.out.println(scores[i]);
		}
		System.out.println("-----"); // 分隔線
		
		for(int i=0, lens=scores.length;i<lens;i++) { // i 用來表示維度
			System.out.println(scores[i]);
		}
		System.out.println("-----"); // 分隔線
		
		// 寫一個 for-each 印出每一個陣列元素
		// for-each 屬於高階迴圈會自動尋訪下一個元素 
		for(int score : scores) {
			System.out.println(score);
		}
		System.out.println("-----"); // 分隔線
	}

}
