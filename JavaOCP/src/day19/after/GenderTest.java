package day19.after;

public class GenderTest {

	public static void main(String[] args) {
		race(Gender.MAN); // 安全的參數
		race(Gender.FEMALE); // 安全的參數 
		//race(1);  // 無法使用
		//race(2);  // 無法使用
		//race(3);  // 無法使用
		//race(-2); // 無法使用
	}
	
	private static void race(Gender gender) {
		switch (gender) {
			case MAN:
				System.out.println("男子 100m");
				break;
			case FEMALE:
				System.out.println("女子 100m");
				break;
		}
	}

}
