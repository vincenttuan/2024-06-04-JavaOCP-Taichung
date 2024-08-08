package day19;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
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
		//set.add(null);
		System.out.println(set);
		// -- 分析 --
		// 只印出成績
		for(Object obj : set) {
			//System.out.println(obj + ", " + obj.getClass().getSimpleName());
			if(obj instanceof Integer) {
				System.out.println(obj);
			}
		}
		System.out.println("-------");
		// 計算總分與平均
		int sum = 0;   // 總分
		int count = 0; // 個數
		for(Object obj : set) {
			if(obj instanceof Integer) {
				int score = (Integer)obj;
				//int score = (int)obj;
				sum += score;
				count++;
			}
		}
		System.out.printf("總分: %d 平均: %.1f%n", sum, (double)sum/count);
		
		
	}
}
