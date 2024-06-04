package day01;

import static day01.MethodDemo3.printAdd;
import static day01.MethodDemo4.printBmi;
import static day01.MethodDemo1.printWords;
// 不同類別間方法可以自由調用 
public class MethodDemo5 {

	public static void main(String[] args) {
		day01.MethodDemo3.printAdd(1, 2);
		day01.MethodDemo4.printBmi(170, 60);
		
		printAdd(1, 2);
		printBmi(170, 60);
		printWords();
	}

}
