package day22;

import java.util.Map;

public class LoginDemo3 {
	private static Map<String, String> userMap = Map.of("john", "1234", "mary", "5678");
	
	public static void main(String[] args) {
		System.out.println(userMap);
		try {
			boolean loginCheck = login("john2", "1234");
			System.out.println("登入: " + loginCheck);
		} catch (LoginException e) {
			System.out.println(e.getMessage());
			System.out.println("請重新執行後再登入");
			e.how2Do();
			//System.out.println(10/0);
		} finally { // 不論是否有例外發生, 一定都會執行的區塊 (保證執行區段)
			System.out.println("登入結束");
		}
		System.out.println("程式結束");
		
	}
	
	// 登入
	public static boolean login(String username, String password) throws LoginException {
		// 判斷是否有此使用者
		if(userMap.containsKey(username)) { // userMap 是否有此使用者
			if(userMap.get(username).equals(password)) {
				return true;
			} else {
				//return false; // username 對, password 不對
				LoginException re = new LoginException("password 不對"); // 自行建立一個錯誤物件
				throw re; // 將此錯誤拋出
			}
		} else {
			//return false; // username 不對
			LoginException re = new LoginException("username 不對"); // 自行建立一個錯誤物件
			throw re; // 將此錯誤拋出
		}
		
	}

}
