package day25;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Random random = new Random();
		int number = random.nextInt(100); // 0~99
		return number; // auto-boxing
	}
	
}
