package day24;

public class ATM {

	public static void main(String[] args) {
		Account account = new Account(10000);
		
		Runnable job1 = new WithdrawJob(account, 8000);
		Runnable job2 = new WithdrawJob(account, 5000);
		Runnable job3 = new WithdrawJob(account, 4000);
		
		Thread t1 = new Thread(job1, "小明");
		Thread t2 = new Thread(job2, "小華");
		Thread t3 = new Thread(job3, "小英");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
