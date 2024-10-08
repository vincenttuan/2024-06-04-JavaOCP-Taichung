package day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigFileRead {

	public static void main(String[] args) {
		Path filePath = Path.of("src", "day26", "bigdata.txt");
		BufferedReader reader = null;
		try {
			reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8);
			String line = null;
			while ((line = reader.readLine()) != null) { // 逐行讀取到 line 變數中
				System.out.println(line);
			}
			
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
