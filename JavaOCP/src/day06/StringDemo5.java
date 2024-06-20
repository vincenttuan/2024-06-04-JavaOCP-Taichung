package day06;

import java.util.Arrays;

public class StringDemo5 {

	public static void main(String[] args) {
		String words = "she sell sea shell on the sea shore";
		System.out.println(words);
		// 請問有幾個字 ?
		// 利用 split 與空格來分隔字串 => String[]
		String[] wordArray = words.split(" ");
		System.out.println(Arrays.toString(wordArray));
		System.out.printf("第一個字:%s%n", wordArray[0]);
		System.out.printf("最後一個字:%s%n", wordArray[wordArray.length-1]);
		System.out.printf("總共有:%d%n", wordArray.length);
		
		String s1 = null; // 未初始
		String s2 = "";   // 有初始, 空字串資料
		System.out.println(s1);
		//System.out.println(s1.length()); // 沒初始的字串是無法對該字串變數進行任何操作
		System.out.println(s2);
		System.out.println(s2.length());
		
		String s3 = "";
		String s4 = "  ";
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
		System.out.println(s4.isBlank());
		System.out.println(s4.isEmpty());
		
		String s5 = "  ab cd  ";
		System.out.println(s5);
		System.out.println(s5.length());
		s5 = s5.trim(); // 去除左右空白
		System.out.println(s5);
		System.out.println(s5.length());
		
		
	}

}
