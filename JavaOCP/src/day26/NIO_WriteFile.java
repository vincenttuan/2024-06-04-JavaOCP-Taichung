package day26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NIO_WriteFile {

	public static void main(String[] args) throws IOException {
		String data = "\nHappy time!";
		Path filePath = Path.of("src", "day26", "data.txt");
		
		Files.writeString(filePath, data);
		System.out.println("寫檔成功");
	}

}
