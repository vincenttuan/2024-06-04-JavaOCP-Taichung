package day23;

public class JobDemo {

	public static void main(String[] args) {
		// 建立二個工作
		Runnable job1 = new Job();
		Runnable job2 = new Job();
		
		// 建立二條執行緒, 分別執行各自的任務
		// t1 執行 job1 的任務
		// t2 執行 job2 的任務
		Thread t1 = new Thread(job1, "烏龜");
		Thread t2 = new Thread(job2, "兔子");
		
		// 執行緒權限(可以設定 1~10, 預設是 5)
		// 數字越大, 越容易被排程選中
		t1.setPriority(10); //Thread.MAX_PRIORITY
		t2.setPriority(1);  //Thread.MIN_PRIORITY
		
		// 開始執行
		t1.start();
		t2.start();

	}

}
