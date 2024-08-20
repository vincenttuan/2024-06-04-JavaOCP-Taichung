package day22;

import java.util.Map;

public class LoginDemo {
	private static Map<String, String> userMap = Map.of("john", "1234", "mary", "5678");
	
	public static void main(String[] args) {
		System.out.println(userMap);
		boolean loginCheck = login("john", "1234");
		System.out.println("登入: " + loginCheck);
	}
	
	// 登入
	public static boolean login(String username, String password) {
		// 判斷是否有此使用者
		if(userMap.containsKey(username)) { // userMap 是否有此使用者
			if(userMap.get(username).equals(password)) {
				return true;
			} else {
				return false; // username 對, password 不對
			}
		} else {
			return false; // username 不對
		}
		
	}

}
