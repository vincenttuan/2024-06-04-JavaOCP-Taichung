package day03;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// 分數陣列
		int[] scores = {70, 80, 100, 90, 40, 61};
		// 找最高分 = ?
		int highScore = IntArrayUtil.getMax(scores);
		// 總分 = ?
		int sum = IntArrayUtil.getSum(scores);
		// 平均 = ?
		double avg = IntArrayUtil.getAvg(scores);
		
		IntArrayUtil.printArray(scores);
		System.out.printf("最高分: %d 總分: %d 平均: %.1f%n",
				highScore, sum, avg);
		
	}

}
