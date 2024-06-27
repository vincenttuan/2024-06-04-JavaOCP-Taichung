package day08.oo;

public class McDonaldsMeals {

	public static void main(String[] args) {
		Meal meal1 = new Meal("1號", 120, "大麥克", "大可", "大薯");
		Meal meal2 = new Meal("2號", 110, "麥香魚", "玉米湯", "小薯");
		Meal meal3 = new Meal("3號", 100, "麥克雞塊", "雪碧", "蘋果派");
		Meal meal4 = new Meal("50元超值", 50, "吉士漢堡", "小可", null);
		
		// 1號餐飲改價格
		meal1.setPrice(150);
		
		// 點餐
		Meal[] meals = {meal1, meal1, meal3, meal4, meal1, meal2, meal3, meal4, meal4};
		// 份數
		System.out.printf("份數: %d%n", meals.length);
		// 顯示所有餐點資料
		for(Meal meal : meals) {
			meal.displayMealInfo();
		}
		
	}

}
