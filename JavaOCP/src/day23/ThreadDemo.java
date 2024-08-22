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
		
		

	}

}
