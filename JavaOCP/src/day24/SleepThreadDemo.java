package day24;

public class SleepThreadDemo {

	public static void main(String[] args) {
		Runnable job1 = () -> {
			System.out.println("區間車-台中出發");
			// 下達 sleep
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("區間車發生故障");
				return;
			}
			System.out.println("區間車-到達台北");
		};
		
		Runnable job2 = () -> {
			System.out.println("自強號-台中出發");
			// ...
			System.out.println("自強號-到達台北");
		};
		
		Thread train1 = new Thread(job1);
		Thread train2 = new Thread(job2);
		
		train1.start();
		//train1.interrupt(); // 讓執行緒停止
		train2.start();
		

	}

}
