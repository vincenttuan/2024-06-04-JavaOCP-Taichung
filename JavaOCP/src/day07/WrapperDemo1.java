package day07;

// 外包類範例
public class WrapperDemo1 {
	public static void main(String[] args) {
		// Integer 外包類
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int big = Integer.max(30, 50);
		System.out.println(big);
		
		String chinese = "100";
		String math = "90";
		// 請問總分 = ?
		System.out.println(chinese + math);
		System.out.println(Integer.parseInt(chinese) + Integer.parseInt(math));
		
		int chineseScore = Integer.parseInt(chinese);
		int mathScore = Integer.parseInt(math);
		System.out.println(chineseScore + mathScore);
		
	}
}
