package day12;

public class TransactionDemo {
	public static void main(String[] args) {
		Transaction tx = new Transaction();
		tx.checkout(0);
		tx.checkout(100);
		String resultCode = tx.checkout(500, "1111-2222-3333-4444");
		System.out.printf("結帳成功的序號: %s%n", resultCode);
	}
}
