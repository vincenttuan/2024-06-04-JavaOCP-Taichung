package day03;

import java.util.Arrays;

// 計算 int 陣列的工具
public class IntArrayUtil {
	
	// 1. 列印元素
	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	// 2. 計算並回傳總和
	public static int getSum(int[] array) {
		int sum = 0;
		for(int i=0, lens=array.length ; i<lens ; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	// 3. 計算並回傳平均
	public static double getAvg(int[] array) {
		int sum = getSum(array);
		double avg = (double)sum / array.length;
		return avg;
	}
	
	// 4. 計算並回傳最大值
	public static int getMax(int[] array) {
		int max = array[0];
		for(int i=1, lens=array.length; i<lens ; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	// 5. 計算並回傳最小值
	public static int getMin(int[] array) {
		int min = array[0];
		for(int i=1, lens=array.length; i<lens ; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
