package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Exemplu7 {

	public static void main(String [] args) {
		Path p = Paths.get("C://AAA/artists.txt");
		
		try {
			double avg = 
				Files.lines(p)
					 .collect(
						Collectors.averagingInt(s -> s.length()));
			
			System.out.println(avg);
			
			IntSummaryStatistics st = 
					Files.lines(p)
					 .collect(
						Collectors.summarizingInt(String::length));
			
			System.out.println(st.getAverage() + " " + st.getCount() + " " + st.getSum());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
