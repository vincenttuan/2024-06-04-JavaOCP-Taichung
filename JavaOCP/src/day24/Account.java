package day24;

public class Account {
	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	// 提款(amount: 提款金額)
	public void withdraw(int amount) {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 要提款$ %d%n", tName, amount);
		if(balance >= amount) {
			int newBalance = balance - amount; // 新的帳戶餘額
			// 模擬提款程序所花費的時間
			for(int i=1;i<=1000;i++) {
				// 模擬提款程序
			}
			balance = newBalance; // 更新帳戶餘額
			System.out.printf("%s 提款 $ %d 成功, 帳戶餘額 $ %d%n", tName, amount, balance);
		} else {
			System.out.printf("%s 提款 $ %d 失敗, 帳戶餘額 $ %d%n", tName, amount, balance);
		}
	}
}
