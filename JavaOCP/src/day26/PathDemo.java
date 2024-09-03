package day26;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		// normalize() 去除冗餘路徑(. 或 ..)
		// .  當下路徑
		// .. 退到前一個路徑
		Path path = Paths.get("C:/temp/company/./salary.txt").normalize();
		System.out.println(path);
		
		Path path2 = Paths.get("C:/temp/company/../salary.txt").normalize();
		System.out.println(path2);
		
		Path path3 = Paths.get("C:/temp/company/../../salary.txt").normalize();
		System.out.println(path3);
		
		Path path4 = Paths.get("C:/temp/../company/../salary.txt").normalize();
		System.out.println(path4);
		
		Path path5 = Paths.get("C:/temp/../company/./salary.txt").normalize();
		System.out.println(path5);
		
	}

}
