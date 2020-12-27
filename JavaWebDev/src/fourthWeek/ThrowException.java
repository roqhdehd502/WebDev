package fourthWeek;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ThrowException {

	public static void main(String[] args) {
		try {
			md1();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void md1() throws IOException { // IOException 예외 넘긴다고 명시(호출한 main 메소드로)
		md2();
	}
	
	private static void md2() throws IOException { // IOExcepton 예외 넘긴다고 명시(호출한 md1 메소드로)
		Path file = Paths.get("D:\\Others\\Programming\\Java Practice\\WebDev\\Simple.txt");
		BufferedWriter writer = null;
		writer = Files.newBufferedWriter(file); // IOException!
		writer.write('A'); // IOException!
		writer.write('Z'); // IOException!
		
		if (writer != null) {
			writer.close(); // IOException!
		}
	}
}