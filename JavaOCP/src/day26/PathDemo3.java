package day26;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo3 {

	public static void main(String[] args) {
		// relativize() 路徑切換
		Path path1 = Paths.get("home");
		Path path2 = Paths.get("home/sally/bar");
		System.out.println("path1: " + path1);
		System.out.println("path2: " + path2);
		
		Path path1_to_path2 = path1.relativize(path2);
		System.out.println("path1_to_path2: " + path1_to_path2);
		
		Path path2_to_path1 = path2.relativize(path1);
		System.out.println("path2_to_path1: " + path2_to_path1);
		
	}

}
