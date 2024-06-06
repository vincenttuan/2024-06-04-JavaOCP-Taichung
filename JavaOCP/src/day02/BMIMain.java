package day02;

import static day02.BMIUtil.getBMI;
import static day02.BMIUtil.getResult;
import static day02.BMIUtil.printBMI;

public class BMIMain {

	public static void main(String[] args) {
		double h1 = 170, w1 = 60;
		double h2 = 165.5, w2 = 48.6;
		
		double bmi1 = getBMI(h1, w1);
		System.out.println(bmi1);
		
		String result1 = getResult(bmi1);
		System.out.println(result1);
		
		printBMI(h1, w1, bmi1, result1);
	}

}
