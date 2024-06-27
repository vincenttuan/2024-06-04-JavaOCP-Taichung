package day08.oo;

public class UserDemo {

	public static void main(String[] args) {
		User user1 = new User("John", 175, 68);
		User user2 = new User("Alice", 160.0, 55);
		User user3 = new User("Bob", 182.5, 85.0);
		
		user1.printUserInfo();
		user2.printUserInfo();
		user3.printUserInfo();
	}

}
