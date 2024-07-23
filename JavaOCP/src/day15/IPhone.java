package day15;

public class IPhone implements InternetService {

	@Override
	public void connectToInternet() {
		System.out.println("具有連網功能");
	}

	@Override
	public void installApp(String appName) {
		System.out.println("安裝 IPhone 版 " + appName + " App");
	}
	
}
