package day02;

public class BevCalMain {

	public static void main(String[] args) {
		
		double cal = BevCalUtil.getCal("tea", 480/100.0);
		System.out.println(cal);
		
		String calLevel = BevCalUtil.getCalLevel(cal);
		System.out.println(calLevel);
	}

}
