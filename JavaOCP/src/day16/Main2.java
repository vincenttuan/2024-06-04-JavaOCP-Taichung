package day16;

public class Main2 {
	
	public static void main(String[] args) {
		Tank tank = new Tank(45);
		Truck truck = new Truck(100, 2);
		
		Car[] cars = {tank, truck};
		
		for(Car car : cars) {
			car.carInfo();
			if(car instanceof Weapon) {
				((Weapon)car).attack();
			}
		}
		
		Weapon[] weapons = {tank};
		for(Weapon weapon : weapons) {
			weapon.attack();
			if(weapon instanceof Car) {
				((Car)weapon).carInfo();
			}
		}
		
		
	}
	
}
