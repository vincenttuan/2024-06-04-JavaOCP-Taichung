package day20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		// Map 鍵(Key)值(Value)對集合
		// HashMap, LinkedHashMap, TreeMap
		// Key 學生姓名, Value 學生年齡
		Map<String, Integer> students = new LinkedHashMap<>();
		students.put("John", 20);
		students.put("Mary", 20);
		students.put("Jack", 18);
		students.put("Rose", 24);
		System.out.println(students);
		System.out.println(students.size());
		System.out.println(students.get("Rose")); // 24
		System.out.println(students.get("Helen")); // null
		// 取得所有的學生姓名
		Set<String> names = students.keySet();
		System.out.println(names);
		// 逐項取得所有學生的年齡
		for(String name : names) {
			System.out.printf("姓名: %s 年齡: %d%n", name, students.get(name));
		}
		// 取得所有學生成績 1
		Collection<Integer> scores = students.values();
		System.out.println(scores);
		// 取得所有學生成績 2
		List<Integer> scoreList = new ArrayList<>(students.values());
		System.out.println(scoreList);
	}

}
