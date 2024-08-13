package day20;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		// Vector Thread-safe 集合
		Vector<Integer> v = new Vector<>();
		for(int i=1;i<=1;i++) {
			v.add(i);
		}
		System.out.println("capacity 總共的空間:" + v.capacity());
		System.out.println("size 已用空間:" + v.size());
		System.out.println(v);
	}
}
