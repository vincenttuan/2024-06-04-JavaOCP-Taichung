package day16;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Tank(45);
		Car car2 = new Truck(100, 2);
		
		car1.carInfo();
		car2.carInfo();
		
		if(car1 instanceof Weapon) { // car1 是否可以轉型 Weapon
			Weapon w1 = (Weapon)car1;
			w1.attack();
		} else {
			System.out.println("car1 不可以轉型 Weapon");
		}
		
		if(car2 instanceof Weapon) { // car2 是否可以轉型 Weapon
			Weapon w2 = (Weapon)car2;
			w2.attack();
		} else {
			System.out.println("car2 不可以轉型 Weapon");
		}
		
	}

}
