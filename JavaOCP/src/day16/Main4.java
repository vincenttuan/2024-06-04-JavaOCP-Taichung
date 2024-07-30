package day16;

public class Main4 {
	public static void main(String[] args) {
		Book book1 = new TechBook("Java", 500);
		Book book2 = new TechBook("VB", 300);
		
		System.out.println(book1.getName());
		System.out.println(book1.getPrice());
		book1.printDetails();
		
		System.out.println(book2.getName());
		System.out.println(book2.getPrice());
		book2.printDetails();
		
		
	}
}
