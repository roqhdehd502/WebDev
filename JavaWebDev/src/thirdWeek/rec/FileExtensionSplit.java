package thirdWeek.rec;

import java.util.Scanner;

public class FileExtensionSplit {
	String exe;
	
	public FileExtensionSplit() {
		
	}
	
	public FileExtensionSplit(String exe) {
		this.exe = exe;
	}
	
	public String getExe() {
		return exe;
	}

	public void setExe(String exe) {
		this.exe = exe;
	}
	
	private void inputExe() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("파일명 및 확장자를 입력해주세요.");
		System.out.println("ex) Hello.java");
		System.out.print("입력: ");
		exe = scanner.nextLine();
		scanner.close();
	}
	
	private String fileName() {
		String[] nmeSplt = exe.split("\\.");
		return nmeSplt[0];
	}
	
	private String extensionName() {
		String[] nmeSplt = exe.split("\\.");
		return nmeSplt[1];
	}

	public void user() {
		inputExe();
		System.out.println("파일 이름은: " + fileName() + " 이며 확장자는 " + extensionName() + " 입니다.");
	}
}