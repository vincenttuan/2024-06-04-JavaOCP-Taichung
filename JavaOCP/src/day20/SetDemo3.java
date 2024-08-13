package day20;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
	public static void main(String[] args) {
		// Set 元素不可重複
		// <Integer> 泛型限制集合元素內容只能是 Integer 或 Integer 的子類 
		//Set<Integer> scores = new HashSet<Integer>(); // Java 5.0
		Set<Integer> scores = new TreeSet<>(); // Java 7.0 <> 自動推斷是 Integer
		scores.add(100);   // Integer
		scores.add(90);    // Integer
		scores.add(85);    // Integer
		System.out.println(scores);
		
		int sum = 0;
		for(Integer score : scores) {
			sum += score;
		}
		System.out.println(sum);
	}
}
