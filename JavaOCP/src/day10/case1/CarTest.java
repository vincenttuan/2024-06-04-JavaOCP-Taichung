package day10.case1;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("S300", "Red", 280, 350);
		Car car2 = new Car("A100", "Blue", 180, 250);
		Car car3 = new Car("T200", "Yellow", 300, 450);
		// 統一設定折扣
		Car.setDiscountRate(0.8);
		
		car1.displayInfo();
		car2.displayInfo();
		car3.displayInfo();
		
		System.out.println(Car.getTotalCars());

	}

}
