package day20;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		List<Integer> scores = new LinkedList<>();
		scores.add(1);
		scores.add(2); // Integer
		scores.add(3);
		scores.add(4);
		System.out.println(scores);
		// 刪除元素 1
		//scores.remove(2); // 2 是 index
		// A: [1, 2, 3, 4] => [1, 3, 4]
		// B: [1, 2, 3, 4] => [1, 2, 4]
		// 刪除元素 2
		scores.remove(Integer.valueOf(2));
		System.out.println(scores);
	}
}
