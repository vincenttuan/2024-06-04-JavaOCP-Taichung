package day01;

// 方法調用 2
public class MethodDemo2 {

	public static void main(String[] args) {
		System.out.println("Hello John");
		System.out.println("Hello Mary");
		System.out.println("Hello Rose");
		
		helloPrint("John");
		helloPrint("Mary");
		helloPrint("Rose");
	}
	
	public static void helloPrint(String name) {
		System.out.println("Hello " + name);
	}

}
