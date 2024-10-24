package hash;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

public class HashDemo {

	public static void main(String[] args) {
		String password = "1234";
		String hashPassword = getHashPassword(password);
		System.out.println(password);
		System.out.println(hashPassword);
		//------------------------------------------------
		String salt = getSalt();
		System.out.println("鹽: " + salt);
		hashPassword = getHashPassword(password, salt);
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
	public static String getSalt() {
		SecureRandom secureRandom = new SecureRandom();
		byte[] salt = new byte[16];
		secureRandom.nextBytes(salt);
		return Base64.getEncoder().encodeToString(salt);
	}
	
	// 產生加鹽雜湊
	public static String getHashPassword(String password, String salt) {
		try {
			// 加密演算法: SHA-256
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			// 加鹽
			md.update(salt.getBytes());
			// 進行加密
			byte[] bytes = md.digest(password.getBytes());
			// 將 byte[] 透過 Base64 編碼方便存入到資料表中
			return Base64.getEncoder().encodeToString(bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

}
