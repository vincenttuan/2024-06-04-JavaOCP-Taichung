package day15;

public class IPhone implements InternetService, Phone {

	@Override
	public void connectToInternet() {
		System.out.println("具有連網功能");
	}

	@Override
	public void installApp(String appName) {
		System.out.println("安裝 IPhone 版 " + appName + " App");
	}

	@Override
	public void call(String number) {
		System.out.println("打電話:" + number);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("接收簡訊:" + message);
	}
	
}
