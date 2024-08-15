package day21;

import java.util.List;

public class StreamDemo2 {
	public static void main(String[] args) {
		List<String> names = List.of("John", "Be", "Anita");
		
		names.stream()
			 //.map((name) -> name.length())
			 .map(String::length)
			 .forEach(System.out::println);
		
		
	}
}
