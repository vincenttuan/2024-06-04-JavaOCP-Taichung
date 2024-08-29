package day25;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
	
	private CyclicBarrier cyclicBarrier;
	
	public Car(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}
	
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 往彰化出發%n", tName);
		Random random = new Random();
		try {
			Thread.sleep(random.nextInt(5000)); //0~4999 ms
			System.out.printf("%s 到了彰化%n", tName);
			cyclicBarrier.await(); // 等待其他人
		} catch (Exception e) {
			System.out.printf("%s 發生中斷停止前進%n", tName);
			return;
		}
		System.out.printf("%s 回台中%n", tName);
	}
	
}
