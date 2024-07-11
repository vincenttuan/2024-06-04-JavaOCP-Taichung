package day12;

// 交易
public class Transaction {
	
	// 現金結帳
	public void checkout(int money) {
		if(money == 0) {
			checkout();
			return;
		}
		System.out.printf("現金 $%d 結帳%n", money);
	}
	
	// 數位結帳
	public String checkout(int money, String cardId) {
		System.out.printf("數位結帳 id: %s $%d 結帳%n", cardId, money);
		return "000-1234-" + money; // 得到結帳成功的序號
	}
	
	// 0元結帳
	private void checkout() {
		System.out.println("0元商品");
	}
	
}
