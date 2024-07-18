package day14;

public class ArgsLoginDemo2 {
	public static String[][] users = 
			{
				{"admin", "1234"}, 
				{"john", "5678"},
				{"mary", "1111"}
			};
	
	
	// 利用 args 來判斷使用者所傳入的 2 個執行參數 args[0] 與 args[1] 是否可以登入
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("請輸入 username & password");
			return;
		}
		
		// 比對 username & password
		String username = args[0];
		String password = args[1];
		
		boolean isLogin = false; // 記錄登入狀態(預設 false)
		for(String[] user : users) {
			// user[0] 使用者名稱, user[1] 使用者密碼
			if(user[0].equals(username) && user[1].equals(password)) {
				System.out.println("登入成功");
				isLogin = true; // 改變登入狀態
				break; // 跳出迴圈
			}
		}
		
		// 檢測登入狀態
		if(isLogin) {
			System.out.println("可以使用此程式所提供的服務");
		} else {
			System.out.println("登入失敗不可以使用此程式");
		}
		

	}

}
