package day16;

public class Truck extends Car {
	private int doors;
	
	public Truck(int speed, int doors) {
		super(speed);
		this.doors = doors;
	}

	@Override
	public void carInfo() {
		System.out.printf("%s門卡車, 時速 %d k/m%n", doors, getSpeed());
	}
	
}
