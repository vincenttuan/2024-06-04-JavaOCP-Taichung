package day16;

public abstract class Car { // 抽象類別
	private int speed;

	public Car(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public abstract void carInfo(); // 抽象類別裡的抽象方法一定要加入 abstract 修飾
	
}	
