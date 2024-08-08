package day19.before;

public class GenderTest {

	public static void main(String[] args) {
		race(1);
		race(2);
		//-------------------
		race(Gender.MAN);
		race(Gender.FEMALE);
		//-------------------
		race(3); // 不安全的參數
		race(-3); // 不安全的參數
	}
	
	private static void race(int value) {
		switch (value) {
			case Gender.MAN:
				System.out.println("男子 100m");
				break;
			case Gender.FEMALE:
				System.out.println("女子 100m");
				break;
		}
	}

}
