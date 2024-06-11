package day03;

public class ArrayDemo4 {

	public static void main(String[] args) {
		// 分數陣列
		int[] scores = {70, 80, 100, 90, 40, 61};
		// 找最高分
		int highScore = scores[0]; // 假設最高分是 scores[0]
		
		for(int i=1, lens=scores.length ; i<lens ; i++) {
			if(scores[i] > highScore) {
				highScore = scores[i]; // 替換最高分
			}
		}
		System.out.printf("最高分: %d%n", highScore);
		
		// 總分 = ?
		int sum = 0;
		
		
		// 平均 = ?
		double avg = 0; // 0.0
		
						
				
				
	}

}
