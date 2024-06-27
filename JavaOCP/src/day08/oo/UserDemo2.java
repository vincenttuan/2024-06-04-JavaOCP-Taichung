package day08.oo;

public class UserDemo2 {

	public static void main(String[] args) {
		User user1 = new User("John", 175, 68);
		user1.printUserInfo();
		
		user1.name = "Jack";
		//user1.height = 190;
		user1.setHeight(190);
		user1.setWeight(90.5);
		user1.printUserInfo();
		
	}

}
