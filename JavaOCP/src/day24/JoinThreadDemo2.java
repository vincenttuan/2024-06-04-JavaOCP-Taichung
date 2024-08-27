package day24;

public class JoinThreadDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		Runnable job1 = () -> {
			System.out.println("等女朋友來會合");
			// ...
		};
		
		Runnable job2 = () -> {
			System.out.println("吃燭光晚餐");
		};
		
		Thread man = new Thread(job1);
		Thread eat = new Thread(job2);
		
		man.start();
		man.join();
		eat.start();
		
	}
	
}
