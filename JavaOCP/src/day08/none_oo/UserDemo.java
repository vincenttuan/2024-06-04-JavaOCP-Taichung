package day08.none_oo;

public class UserDemo {

	public static void main(String[] args) {
		// 紀錄 3 個使用者(User)的身高(height), 體重(weight)與 bmi
		String name1 = "John";
		double height1 = 175;
		double weight1 = 68;
		double bmi1 = weight1 / Math.pow(height1/100, 2);
		displayUserInfo(name1, height1, weight1, bmi1);
		
		String name2 = "Alice";
		double height2 = 160.0;
		double weight2 = 55;
		double bmi2 = weight2 / Math.pow(height2/100, 2);
		displayUserInfo(name2, height2, weight2, bmi2);
		
		String name3 = "Bob";
		double height3 = 182.5;
		double weight3 = 85.0;
		double bmi3 = weight3 / Math.pow(height3/100, 2);
		displayUserInfo(name3, height3, weight3, bmi3);
		
	}
	
	public static void displayUserInfo(String name, double height, double weight, double bmi) {
		System.out.printf("姓名: %-5s 身高: %.1f 體重: %.1f BMI: %.2f%n",
				name, height, weight, bmi);
	}

}
