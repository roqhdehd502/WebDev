package fourthWeek;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryFinally {

	public static void main(String[] args) {
		Path file = Paths.get("D:\\Others\\Programming\\Java Practice\\WebDev\\Simple.txt");
		
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);
			
			writer.write('A');
			writer.write('Z');
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 실행의 흐름이 try 구문 안에 들어왔을 때 반드시 실행해야 하는 문장을 finally 구문에 둘 수 있다.
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}