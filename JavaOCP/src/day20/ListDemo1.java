package day20;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// List 元素可以重複
		// ArrayList: 新增元素快, 修改與刪除元素慢
		// LinkedList: 新增元素慢, 修改與刪除元素快
		List<Integer> scores = new ArrayList<>();
		scores.add(100);
		scores.add(75);
		scores.add(85);
		scores.add(100);
		System.out.println(scores);
		System.out.println(scores.size());
		System.out.println(scores.get(0));
		System.out.println(scores.get(1));
		System.out.println(scores.get(2));
		System.out.println(scores.get(3));
		System.out.println("-----");
		// 移除 index = 1 的元素
		scores.remove(1);
		System.out.println(scores);

	}

}
