package day25;

// 長任務
public class LongTask implements Runnable {

	@Override
	public void run() {
		System.out.println("長任務開始");
		//-- 模擬任務所花費的時間 ---------------
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//---------------------------------
		System.out.println("長任務結束");
	}

}
