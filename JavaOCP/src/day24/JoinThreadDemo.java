package day24;

public class JoinThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Runnable job1 = () -> {
			System.out.println("員工領薪水");
		};
		
		Runnable job2 = () -> {
			// 模擬公司發薪的程序所花費的時間
			for(int i=0;i<Integer.MAX_VALUE;i++) {
				// ...
			}
			System.out.println("公司發薪水");
		};
		
		Thread employee = new Thread(job1);
		Thread company = new Thread(job2);
		
		company.start();
		company.join(); // 等待 company 執行完畢之後才會往下執行
		employee.start();
	}

}
