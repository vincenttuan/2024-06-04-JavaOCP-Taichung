package day16;

public class Tank extends Car implements Weapon {

	public Tank(int speed) {
		super(speed);
	}

	@Override
	public void attack() {
		System.out.println("發射榴彈砲");
	}

	@Override
	public void carInfo() {
		System.out.printf("坦克時速 %d k/m%n", getSpeed());
	}
	
	
}
