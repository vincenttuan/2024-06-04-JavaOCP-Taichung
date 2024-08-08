package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		// HashSet 無序集合(根據資料的 hashcode 來決定擺放位置)
		// 放入資料快
		Set set = new HashSet();
		set.add("國"); // String
		set.add(95);  // Integer (auto-boxing) 建議寫法
		set.add("數"); // String
		set.add(Integer.valueOf(60)); // Integer
		set.add("英");
		set.add(new Integer(80)); // Integer
		set.add(null);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("國"));
		System.out.println(set.contains("自"));
		
		// 輪詢所有元素: 利用 for-each
		for(Object obj : set) {
			System.out.println(obj);
		}
		System.out.println("--------");
		
		// 輪詢所有元素: 利用 Iterator
		Iterator iter = set.iterator(); // 取得 iterator
		while (iter.hasNext()) {
			Object obj = iter.next(); // 得到元素
			System.out.println(obj);
		}
		System.out.println("--------");
		
		// 將 null 移除 ?
		iter = set.iterator(); // 重新取得 iterator
		while (iter.hasNext()) {
			Object obj = iter.next(); // 得到元素
			if(obj == null) {
				System.out.println("移除 " + obj + " 元素");
				iter.remove();
			}
		}
		System.out.println(set);
		
	}

}
