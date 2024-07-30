package day16;

public interface Book {
	
	public abstract String getName();
	public abstract Integer getPrice();
	
	// Java 8 後出現了在 interface 可以有實作的方法
	// default 方法可以給外界來調用與呼叫
	// public 可以不用寫
	public default void printDetails() {
		System.out.println("書名:" + getName());
		System.out.println("價格:" + formatPrice(getPrice()));
	}
	
	// private 方法只可以給該介面內部調用
	// private 在這邊一定要寫
	private String formatPrice(Integer price) {
		hello();
		return "$" + price;
	}
	
	private void hello() {
		System.out.println("Hello");
	}
	

}
