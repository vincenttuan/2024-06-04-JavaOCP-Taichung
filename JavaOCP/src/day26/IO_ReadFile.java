package day26;

import java.io.FileReader;
import java.io.IOException;

public class IO_ReadFile {

	public static void main(String[] args) {
		char[] buffer = new char[1]; // 讀資料暫存區(一次讀一個字元)
		
		try(FileReader fr = new FileReader("src/day26/data.txt");) {
			
			System.out.println("讀取 data.txt 檔案內容");
			System.out.println("------------------");
			
			while (fr.read(buffer) != -1) {
				//System.out.print(buffer[0]);
				System.out.print(new String(buffer));
			}
			
		} catch (IOException e) {
			e.printStackTrace(System.err);
		}

	}

}
