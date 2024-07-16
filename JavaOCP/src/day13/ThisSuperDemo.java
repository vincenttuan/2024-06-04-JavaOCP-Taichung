package day13;

class Coffee {
	int price = 100;
	
	Coffee() {
		System.out.println("美式咖啡");
		this.cook();
		System.out.println(this.price);
	}
	
	void cook() {
		//this(); // 方法中不可以調用建構子
		System.out.println(this.price);
		System.out.println("煮咖啡");
	}
	
}


public class ThisSuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
