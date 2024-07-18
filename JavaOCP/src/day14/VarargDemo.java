package day14;

public class VarargDemo {
	
	// ... 省略號, 可以放入 0~N個參數
	// 在實作上要以陣列看待
	public static int add(int... values) {
		int sum = 0;
		for(int x : values) {
			sum += x;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10, 20));
		
		System.out.println(add(10, 20, 30));
		
		int[] nums = {10, 20, 30, 40};
		System.out.println(add(nums));
		
		System.out.println(add(new int[] {10, 20, 30, 40, 50}));
		
		System.out.println(add()); // 不給參數
	}

}
