package day25;

import java.util.concurrent.CyclicBarrier;

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
		
		
		
	}
	
}
