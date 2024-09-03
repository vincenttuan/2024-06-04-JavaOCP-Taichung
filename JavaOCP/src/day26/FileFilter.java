package day26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileFilter {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("src", "day26", "score.txt");
		// 過濾出有 "7" 的資料
		Files.lines(path)
			 .filter(row -> row.contains("7")) // 過濾出每一筆資料含有"7"的內容
			 .forEach(System.out::println);
	}

}
