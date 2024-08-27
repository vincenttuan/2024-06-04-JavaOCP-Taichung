package day24;

// 執行緒提款的工作
public class WithdrawJob implements Runnable {
	private Account account;
	private int amount;
	
	public WithdrawJob(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		// 對 account 進行提款程序
		account.withdraw(amount);
	}

}
