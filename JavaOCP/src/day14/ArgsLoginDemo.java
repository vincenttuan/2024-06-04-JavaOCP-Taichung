package day14;

public class ArgsLoginDemo {
	
	private static String username = "admin";
	private static String password = "1234";
	
	// 使用者在執行此程式時必需要帶入 username/password 參數資訊
	// 例如: java ArgsLoginDemo admin 1234
	public static void main(String[] args) {
		// 判斷 username/password
		if(username.equals(args[0]) && password.equals(args[1])) {
			System.out.println("登入成功");
			System.out.println("可以繼續執行相關服務...");
		} else {
			System.out.println("登入失敗");
		}
		
	}
}
