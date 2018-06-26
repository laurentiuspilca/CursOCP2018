package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Main {

	public List<String> readList(String path) {
		try {
			List<String> list = Files.readAllLines(Paths.get(path));
			return list;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Collections.emptyList();
	}
	
	public String getMyString() {
		return "";
	}
	
	public Optional<Product> getMyProduct() {
		return Optional.empty();
	}
}
 