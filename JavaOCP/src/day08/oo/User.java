package day08.oo;

// 定義 User 物件的類別
public class User {
	// 物件屬性
	String name; // 姓名
	private double height; // 身高 (private 表示私有, 不允許外界直接操作)
	private double weight; // 體重
	double bmi; // bmi值
	
	// 建構子: 建立物件的時候要執行的程序
	// 例如: 設定物件屬性的初始資料
	public User(String name, double height, double weight) {
		this.name = name; // 設定 name 物件屬性的內容
		this.height = height; // 設定 height 物件屬性的內容
		this.weight = weight; // 設定 weight 物件屬性的內容
		this.bmi = weight / Math.pow(height/100, 2); // 設定 bmi 物件屬性的內容
	}
	
	//------------------------------------------------------------------------
	
	// 物件方法, 直接可以取用物件屬性的內容
	public void printUserInfo() { 
		System.out.printf("姓名: %-5s 身高: %.1f 體重: %.1f BMI: %.2f%n",
				name, height, weight, bmi);
	}
	
	//------------------------------------------------------------------------
	
	// 物件方法, 變更/設定身高用
	public void setHeight(double height) {
		if(height < 0) {
			return;
		}
		// 重設 height
		this.height = height;
		// 重算 bmi
		this.bmi = weight / Math.pow(height/100, 2); // 設定 bmi 物件屬性的內容 
	}
	
	//------------------------------------------------------------------------
	
	// 物件方法, 變更/設定體重使用
	public void setWeight(double weight) {
		if(weight < 0) {
			return;
		}
		// 重設 weight
		this.weight = weight;
		// 重算 bmi
		this.bmi = weight / Math.pow(height/100, 2); // 設定 bmi 物件屬性的內容 
	}
}
