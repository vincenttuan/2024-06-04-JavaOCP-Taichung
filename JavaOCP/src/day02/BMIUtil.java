package day02;

// BMI 工具
public class BMIUtil {
	public static double bmiMax = 23.0;
	public static double bmiMin = 18.0;
	public static String normal = "正常";
	public static String overWeight = "過重";
	public static String lossWeight = "過輕";
	
	// 計算並取得 BMI
	public static double getBMI(double height, double weight) {
		double bmi = weight / Math.pow(height/100, 2);
		return bmi;
	}
	
	// 診斷 BMI
	public static String getResult(double bmi) {
		String result = bmi > bmiMax ? overWeight : bmi <= bmiMin ? lossWeight : normal;
		return result;
	}
	
	// 印出 BMI 相關資訊
	public static void printBMI(double height, double weight, double bmi, String result) {
		System.out.printf("身高: %.1f 體重: %.1f BMI: %.2f 診斷: %s%n", height, weight, bmi, result);
	}
	
}
