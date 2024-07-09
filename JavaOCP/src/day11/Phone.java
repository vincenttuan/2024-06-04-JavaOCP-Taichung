package day11;

public class Phone {

	private String brand;

	private String model;

	public Phone() {
	}

	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public void makeCall(String number) {
		System.out.printf("%s %s Calling: %s%n", brand, model, number);
	}

}
