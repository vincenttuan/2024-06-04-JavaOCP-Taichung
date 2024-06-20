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
	}

}
