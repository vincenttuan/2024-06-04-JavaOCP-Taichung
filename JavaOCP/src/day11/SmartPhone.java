package day11;

public class SmartPhone extends Phone {
 
	private String operationSystem; // 作業系統：如 iOS, Android
	
	// 子類別的建構子
	public SmartPhone() {
	
	}
	
	// 子類別的建構子：作業系統
	public SmartPhone(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	 
	// 子類別的建構子：初始化品牌、型號和作業系統
	public SmartPhone(String brand, String model, String operationSystem) {
		super(brand, model);
		this.operationSystem = operationSystem;
	}
	
	// 安裝應用程式的方法：模擬安裝應用程式的功能
	public void installApp(String appName) {
		System.out.printf("Install %s on %s%n", appName, operationSystem);
	}
	
	// 設定作業系統
	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	 
}
 
