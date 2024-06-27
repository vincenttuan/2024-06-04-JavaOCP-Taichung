package day08.none_oo;

public class UserDemo {

	public static void main(String[] args) {
		// 紀錄 3 個使用者(User)的身高(height), 體重(weight)與 bmi
		String name1 = "John";
		double height1 = 175;
		double weight1 = 68;
		double bmi1 = weight1 / Math.pow(height1/100, 2);
		
		String name2 = "Alice";
		double height2 = 160.0;
		double weight2 = 55;
		double bmi2 = weight2 / Math.pow(height2/100, 2);
		
		String name3 = "Bob";
		double height3 = 182.5;
		double weight3 = 85.0;
		double bmi3 = weight3 / Math.pow(height3/100, 2);
	}

}
