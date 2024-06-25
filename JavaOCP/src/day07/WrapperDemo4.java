package day07;

public class WrapperDemo4 {

	public static void main(String[] args) {
		Integer[] scores = {100, null, 90, null, 80}; // Auto-Boxing
		// 計算總分
		int sum = 0;
		for(Integer score : scores) { 
			if(score == null) {
				continue;
			}
			sum += score; // Auto-Unboxing
		}
		System.out.println(sum);
	}

}
