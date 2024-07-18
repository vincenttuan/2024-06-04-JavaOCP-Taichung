package day14;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] names = {"apple", "banana"};
		System.out.println(names[0].toString());
		System.out.println(names[1].toString());
		System.out.println(Arrays.toString(names));
		//----------------------------------------
		Ball[] balls = {new Ball("red", 100), new Ball("blue", 200)};
		System.out.println("十進位:" + balls[0].hashCode());
		System.out.println("十進位:" + balls[1].hashCode());
		System.out.println("十六進位:" + Integer.toHexString(balls[0].hashCode()));
		System.out.println("十六進位:" + Integer.toHexString(balls[1].hashCode()));
		System.out.println(balls[0].toString());
		System.out.println(balls[1].toString());
		
	}

}
