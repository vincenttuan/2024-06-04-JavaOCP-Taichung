package day10.case2;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("S300", "Red", 280, 350);
		Car car2 = new Car("A100", "Blue", 180, 250);
		Car car3 = new Car("T200", "Yellow", 300, 450);
		Car car4 = new Car("F500", "Green", 450, 1000);
		// 設定折扣
		CarUtil.setDiscountRate(0.75);
		
		car1.displayInfo();
		car2.displayInfo();
		car3.displayInfo();
		car4.displayInfo();
		
		// 顯示總共創建幾台車
		System.out.println(CarUtil.getTotalCars());
	}

}
