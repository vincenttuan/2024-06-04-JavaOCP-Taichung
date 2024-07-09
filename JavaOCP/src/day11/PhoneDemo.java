package day11;

public class PhoneDemo {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("Apple", "iPhone", "iOS 15");
		smartPhone.makeCall("0912345678");
		smartPhone.installApp("仙劍奇俠傳");
		
		LandlinePhone landlinePhone = new LandlinePhone("Panasonic", "KX-TG7875S", true);
		landlinePhone.makeCall("04-2234-5678");
		landlinePhone.recordMessage();

	}

}
