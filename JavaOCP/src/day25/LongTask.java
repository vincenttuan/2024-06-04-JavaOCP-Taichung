package day25;

// 長任務
public class LongTask implements Runnable {

	@Override
	public void run() {
		System.out.println("長任務開始");
		for(int i=1;i<Integer.MAX_VALUE;i++); // 模擬任務處理時間
		System.out.println("長任務結束");
	}

}
