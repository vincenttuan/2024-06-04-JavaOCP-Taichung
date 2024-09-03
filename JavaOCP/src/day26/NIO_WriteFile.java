package day26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NIO_WriteFile {

	public static void main(String[] args) throws IOException {
		String data = "\nHappy time!";
		Path filePath = Path.of("src", "day26", "data.txt");
		// StandardOpenOption.APPEND 寫入到原資料的後面
		Files.writeString(filePath, data, StandardOpenOption.APPEND);
		System.out.println("寫檔成功");
	}

}
