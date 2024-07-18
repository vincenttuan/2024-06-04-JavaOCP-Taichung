package day14;

public class BallDemo {

	public static void main(String[] args) {
		Ball b1 = new Ball("red", 100);
		Ball b2 = b1;
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		
		Ball b3 = new Ball("red", 100);
		System.out.println(b1 == b3);
		System.out.println(b1.equals(b3));
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		System.out.println(b1); // b1.toString();
		System.out.println(b2);
		System.out.println(b3);
	}

}
