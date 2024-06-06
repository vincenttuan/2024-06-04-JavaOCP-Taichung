package day02;

public class BevCalMain {

	public static void main(String[] args) {
		String bevType = "coffee";
		double ml = 480;
		
		double cal = BevCalUtil.getCal(bevType, ml/100.0);
		System.out.println(cal);
		
		String calLevel = BevCalUtil.getCalLevel(cal);
		System.out.println(calLevel);
		
		BevCalUtil.printCal(bevType, ml, cal, calLevel);
		
	}

}
