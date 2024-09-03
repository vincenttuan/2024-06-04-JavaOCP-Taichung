package day26;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo2 {

	public static void main(String[] args) {
		// resolve() 路徑結合
		Path path1 = Paths.get("C:/temp/company/finance");
		Path path2 = Paths.get("salary.txt");
		Path path3 = path1.resolve(path2);
		System.out.println(path1);
		System.out.println(path2);
		System.out.println(path3);
	}

}
