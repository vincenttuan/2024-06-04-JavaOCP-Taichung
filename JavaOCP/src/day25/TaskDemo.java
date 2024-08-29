package day25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskDemo {

	public static void main(String[] args) {
		// 建立任務
		Runnable r1 = new ShortTask(); // 短任務
		Runnable r2 = new ShortTask(); // 短任務
		Runnable r3 = new LongTask();  // 長任務
		Runnable r4 = new LongTask();  // 長任務
		Runnable r5 = new ShortTask(); // 短任務
		
		// 建立一個執行緒服務
		//ExecutorService service = Executors.newCachedThreadPool();
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.submit(r1); // 啟動短任務
		service.submit(r2); // 啟動短任務
		service.submit(r3); // 啟動長任務
		service.submit(r4); // 啟動長任務
		service.submit(r5); // 啟動短任務
		
		int activeCount = Thread.activeCount(); // 執行緒數量
		System.out.printf("執行緒數量: %d%n", activeCount);
		// 關閉服務
		//service.shutdown();
		service.shutdownNow();
		
	}

}
