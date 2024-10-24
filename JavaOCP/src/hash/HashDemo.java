package hash;

import java.security.MessageDigest;
import java.util.Base64;

public class HashDemo {

	public static void main(String[] args) {
		String password = "1234";
		String hashPassword = getHashPassword(password);
		System.out.println(password);
		System.out.println(hashPassword);
	}
	
	// 產生雜湊
	public static String getHashPassword(String password) {
		try {
			// 加密演算法: SHA-256
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			// 進行加密
			byte[] bytes = md.digest(password.getBytes());
			// 將 byte[] 透過 Base64 編碼方便存入到資料表中
			return Base64.getEncoder().encodeToString(bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// 產生鹽
	
	// 產生加鹽雜湊 
	
	

}
