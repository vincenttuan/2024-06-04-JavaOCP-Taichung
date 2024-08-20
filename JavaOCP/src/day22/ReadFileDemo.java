package day22;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileDemo {

	public static void main(String[] args) {
		Path path = Paths.get("src/day22", "data.txt");
		System.out.printf("檔案路徑: %s%n", path);
		String content = Files.readString(path);
		System.out.printf("檔案內容: %s%n", content);
		
		
	}

}
