package day23;

public class CalculatorTest {

	public static void main(String[] args) {
		// 取得目前的執行緒名稱
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " 在執行 main() 程式");
		// 測試 Calculator
		testAdd();
		System.out.println("測試通過");
	}
	
	// 測試加法器
	private static void testAdd() {
		// 取得目前的執行緒名稱
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " 在執行 testAdd() 程式");
		// 1. Arrange(準備)
		Calculator calculator = new Calculator();
		int x = 5;  // 測試資料
		int y = 10; // 測試資料
		int expected = 15; // 設定期望結果
		
		// 2. Act(執行)
		int actual = calculator.add(x, y); // 得到實際結果
		
		// 3. 下斷言(注意! 執行此程式要加上 -ea)
		assert(actual == expected): "加法測試失敗, 期望:" + expected + " 實際:" + actual;
	}

}
