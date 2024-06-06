package day02;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] scores = {100, 75, 53, 98, 41};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		int score = scores[0]; // "取得"指定維度的陣列元素內容
		System.out.printf("score = %d%n", score);
		
		System.out.printf("改變前: %d%n", scores[3]);
		scores[3] = 89; // "改變"指定維度的陣列元素內容
		System.out.printf("改變後: %d%n", scores[3]);
		
		int lens = scores.length; // 取得陣列長度
		System.out.printf("陣列長度: %d%n", lens);
		
		
	}

}
