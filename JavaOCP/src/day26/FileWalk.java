package day26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FileWalk {
	public static void main(String[] args) throws IOException {
		Stream<Path> files = Files.walk(Path.of("src"));
		files.forEach(path -> {
			System.out.print(path.toFile().isFile()?"[檔案]":"[目錄]");
			System.out.print(path + " 建立時間");
			try {
				System.out.println(Files.readAttributes(path, BasicFileAttributes.class).creationTime());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		});
	}
}
