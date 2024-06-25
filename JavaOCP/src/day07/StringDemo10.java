package day07;

import java.util.Arrays;

public class StringDemo10 {
	
	/**
	 * 更新字串陣列中指定索引的元素 
	 * 
	 * @param array 將被更新的字串陣列
	 * @param index 要更新的元素索引(維度)
	 * @param value 要更新的字串內容
	 */
	public static void update(String[] array, int index, String value) {
		array[index] = value;
	}
	
	public static void main(String[] args) {
		String[] names = {"Alice", "Bob", "Charlie"};
		System.out.println(Arrays.toString(names));
		// 更新陣列索引=1的內容為 Robert
		update(names, 1, "Robert");
		System.out.println(Arrays.toString(names));
		
	}

}
