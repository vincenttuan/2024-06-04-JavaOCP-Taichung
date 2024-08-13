package day20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		// Map 鍵(Key)值(Value)對集合
		// Hashtable is Thread-safe
		// Key 學生姓名, Value 學生年齡
		Hashtable<String, Integer> students = new Hashtable<>();
		students.put("John", 20);
		students.put("Mary", 20);
		students.put("Jack", 18);
		students.put("Rose", 24);
		System.out.println(students);
		
		// 走訪器 
		Enumeration<Integer> e = students.elements();
		while (e.hasMoreElements()) {
			Integer age = e.nextElement();
			System.out.println(age);
		}
	}

}
