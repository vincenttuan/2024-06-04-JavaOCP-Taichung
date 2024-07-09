package day11;

public class LandlinePhone extends Phone {
 
	private boolean hasAnswering;
	 
	public LandlinePhone() {
	}
	 
	public LandlinePhone(boolean hasAnswering) {
		this.hasAnswering = hasAnswering;
	}
	 
	public LandlinePhone(String brand, String model, boolean hasAnswering) {
		super(brand, model);
		this.hasAnswering = hasAnswering;
	}
	 
	public void recordMessage() {
		if(hasAnswering) {
			System.out.printf("請聽到嗶~聲後留言...");
		} else {
			System.out.println("本裝置不支援答錄");
		}
	}
	 
}
 
