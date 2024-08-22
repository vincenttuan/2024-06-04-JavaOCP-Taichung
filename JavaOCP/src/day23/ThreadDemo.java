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
		
		// 建立二條執行緒
		Thread t1 = new Thread(lotto); // 執行 Lotto 數字工作
		Thread t2 = new Thread(now); // 執行 現在時刻工作
		
		// 啟動
		t1.start();
		t2.start();
		
		

	}

}
