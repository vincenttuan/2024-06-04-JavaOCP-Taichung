package day22;

public class LoginException extends Exception {
	
	public LoginException(String errorMessage) {
		super(errorMessage); // 讓 e.getMessage() 有資料
	}
	
	// 自訂方法
	public void how2Do() {
		System.out.println("請重新登入");
	}
	
}
