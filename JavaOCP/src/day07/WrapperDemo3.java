package day07;

import java.util.Arrays;

public class WrapperDemo3 {

	public static void main(String[] args) {
		// int vs Integer ?
		int[] scoresA = new int[5];
		Integer[] scoresB = new Integer[5];
		
		System.out.println(Arrays.toString(scoresA));
		System.out.println(Arrays.toString(scoresB));
	}

}
