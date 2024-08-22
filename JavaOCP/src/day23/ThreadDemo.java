package day23;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
	@FunctionalInterface
	public interface Runnable {
		public abstract void run();
	}
 */
public class ThreadDemo {

	public static void main(String[] args) {
		// 用 Lambda 來實現 Runnable
		// Lotto 數字
		Runnable lotto = () -> {
			Random random = new Random();
			System.out.printf("Lotto: %d%n", random.nextInt(100));
		};
		
		// 現在時刻
		Runnable now = () -> {
			Date tody = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
			System.out.printf("現在時刻: %s%n", sdf.format(tody));
		};
		
		// 背景音樂
		Runnable music = () -> {
			for(int i=1;;i++) {
				System.out.printf("背景音樂: %d%n", i);
			}
		};
		
		// 建立二條執行緒
		Thread t1 = new Thread(lotto); // 執行 Lotto 數字工作
		Thread t2 = new Thread(now); // 執行 現在時刻工作
		Thread t3 = new Thread(music); // 執行 背景音樂
		t3.setDaemon(true); // 將 t3 設定為背景執行緒
		
		// 啟動
		t3.start();
		t1.start();
		t2.start();
		
		

	}

}
