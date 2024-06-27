package day08.oo;

// 組合餐
public class Meal {
	private String name;
	private Integer price;
	private String hamburgerName; // 主餐名(漢堡)
	private String beverageName;  // 飲料名
	private String sideMealName;  // 副餐名
	
	// 建構子
	public Meal(String name, Integer price, String hamburgerName, String beverageName, String sideMealName) {
		this.name = name;
		this.price = price;
		this.hamburgerName = hamburgerName;
		this.beverageName = beverageName;
		this.sideMealName = sideMealName;
	}

	public void setBeverageName(String beverageName) {
		this.beverageName = beverageName;
	}

	public void setSideMealName(String sideMealName) {
		this.sideMealName = sideMealName;
	}
	
	public void displayMealInfo() {
		System.out.printf("%s餐 價格: %d 漢堡: %s 飲料: %s 副餐: %s%n", 
				name, price, hamburgerName, beverageName, sideMealName);
	}
	
}
