package day26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NIO_ReadFile {

	public static void main(String[] args) throws IOException {
		Path filePath = Path.of("src", "day26", "data.txt");
		// 讀取檔案內容
		String data = Files.readString(filePath); // Java 11 語法
		System.out.println(data);
	}

}
