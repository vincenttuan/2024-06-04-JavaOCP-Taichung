package day23;

// 執行緒要執行的工作
public class Job implements Runnable {
	
	// 執行任務
	@Override
	public void run() {
		mission1();
	}
	
	private void mission1() {
		// 印出 1~1000 步
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 開始跑%n", tName);
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 跑第 %d 步%n", tName, i);
		}
		System.out.printf("%s 跑完了%n", tName);
	}
	

}
