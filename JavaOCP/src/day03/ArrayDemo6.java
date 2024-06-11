package day03;

public class ArrayDemo6 {

	public static void main(String[] args) {
		int[] scoreA = {80, 85, 100, 50, 70, 30};
		int[] scoreB = {45, 60, 55, 65, 62, 58};
		
		// 試問 A, B 二班哪一班成績較為集中
		double avgA = IntArrayUtil.getAvg(scoreA);
		double sumA = 0;
		for(int i=0, lens=scoreA.length ; i<lens ; i++) {
			sumA += Math.pow(scoreA[i] - avgA, 2);
		}
		// A 班標準差
		double sdA = Math.sqrt(sumA / scoreA.length);
		System.out.printf("A 班標準差: %.1f%n", sdA);
		
		// B 班標準差
		double sdB = IntArrayUtil.getSD(scoreB);
		System.out.printf("B 班標準差: %.1f%n", sdB);
		
		// 集中度判斷
		String result = sdA < sdB ? "A班" : "B班";
		System.out.printf("%s分數較集中%n", result);
		
	}

}
