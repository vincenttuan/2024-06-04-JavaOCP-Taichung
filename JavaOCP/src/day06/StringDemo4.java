package day06;

public class StringDemo4 {

	public static void main(String[] args) {
		String words = "she sell sea shell on the sea shore";
		//              0123456789...
		System.out.printf("英文繞口令: %s%n", words);
		// words 是否有 sea 這個字串 ?
		System.out.println(words.contains("sea"));
		System.out.println(words.contains("water"));
		System.out.println(words.indexOf("sea"));
		System.out.println(words.indexOf("water"));
		// words 字串長度
		System.out.println(words.length());
		// 第19個位置的資料
		System.out.println(words.charAt(19));
		// 字串連結
		//words = words.concat(" by vincent");
		//words = words + " by vincent";
		words += " by vincent";
		System.out.println(words);
	}

}
