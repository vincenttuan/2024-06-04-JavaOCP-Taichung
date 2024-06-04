package day01;

public class MethodDemo4 {

	public static void main(String[] args) {
		// 請幫我設計一個 printBmi 的方法
		// 當傳入身高與體重時, 可以印出身高,體重,bmi 與診斷資訊
		
		double h = 170; // 170.0
		double w = 60;  // 60.0
		printBmi(h, w);
		
		printBmi(165.0, 65.5);
	}
	
	public static void printBmi(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		String result = bmi > 23 ? "過重" : bmi <= 18 ? "過輕" : "正常";
		System.out.printf("身高:%.1f 體重:%.1f bmi:%.2f 診斷:%s%n", h, w, bmi, result);
	}
	
	

}
