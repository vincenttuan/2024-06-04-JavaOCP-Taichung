package day23;

public class AssertionDemo {

	public static void main(String[] args) {
		// 如何讓 Assert 可以執行
		int score = -1; // 成績
		// 不滿足 (score >= 0) 則會拋出 AssertionError
		assert(score >= 0): "成績必須是正整數, 你輸入的是:" + score; 
		System.out.println("看到我表示 assert 沒有被執行到");

	}

}
