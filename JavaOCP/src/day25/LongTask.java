package day25;

// 長任務
public class LongTask implements Runnable {

	@Override
	public void run() {
		System.out.println("長任務開始");
		//-- 模擬任務所花費的時間 ---------------
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("執行緒被中斷:" + e.getMessage());
		}
		//---------------------------------
		System.out.println("長任務結束");
	}

}
