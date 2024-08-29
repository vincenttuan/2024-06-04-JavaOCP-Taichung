package day25;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 循環屏障
public class CyclicBarrierDemo {
	
	public static void main(String[] args) {
		// 循環屏障達到時要做的工作
		Runnable eat = () -> System.out.println("吃彰化肉圓");
		Runnable ktv = () -> System.out.println("唱 ktv");
		// 建立循環屏障物件
		CyclicBarrier cyclicBarrier = new CyclicBarrier(4, eat);
		// -------------------------------------------------------
		
		Runnable car1 = new Car(cyclicBarrier);
		Runnable car2 = new Car(cyclicBarrier);
		Runnable car3 = new Car(cyclicBarrier);
		Runnable car4 = new Car(cyclicBarrier);
		
		/** 傳統寫法
		Thread t1 = new Thread(car1);
		Thread t2 = new Thread(car1);
		Thread t3 = new Thread(car1);
		Thread t4 = new Thread(car1);
		t1.start();
		t2.start();
		t3.start();
		t3.start();
		*/
		
		/** 使用執行緒服務框架寫法 */
		ExecutorService service = Executors.newCachedThreadPool();
		service.submit(car1);
		service.submit(car2);
		service.submit(car3);
		service.submit(car4);
		
		service.shutdown();
		
		
	}
	
}
