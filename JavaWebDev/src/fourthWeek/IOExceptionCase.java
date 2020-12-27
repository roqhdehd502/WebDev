package fourthWeek;

//import java.util.InputMismatchException;

public class IOExceptionCase {

	public static void main(String[] args) {
		try {
			int num = 6 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		catch (InputMismatchException e) { // Exception 객체가 이미 생성되었기 때문에 상속받는 InputMismatchException으로 선언x
			e.printStackTrace();
		}
		*/

	}

}
