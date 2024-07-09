package day11;

public class SmartPhone extends Phone {
 
	private String operationSystem;
	 
	public SmartPhone() {
	
	}
	 
	public SmartPhone(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	 
	public SmartPhone(String brand, String model, String operationSystem) {
		super(brand, model);
		this.operationSystem = operationSystem;
	}
	 
	public void installApp(String appName) {
		System.out.printf("Install %s on %s%n", appName, operationSystem);
	}
	
	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	 
}
 
