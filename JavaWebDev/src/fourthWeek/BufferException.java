package fourthWeek;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferException {

	public static void main(String[] args) {
		Path file = Paths.get("D:\\Others\\Programming\\Java Practice\\WebDev\\SimplePrinter.txt"); 
		BufferedWriter writer = null;
		
		try { // IOException 발생 가능한 코드들
			writer = Files.newBufferedWriter(file);
			
			writer.write('A');
			writer.write('B');
			
			if (writer != null) {
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace(); // Exception을 상속하는 예외는 반드시 처리를 하지 않으면 컴파일 오류로 이어진다.
		}
	}

}
