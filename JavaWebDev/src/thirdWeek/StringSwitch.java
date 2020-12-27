package thirdWeek;

public class StringSwitch {

	public static void main(String[] args) {
		String str = "two";
		
		switch (str) {
		case "one":
			System.out.println("one");
			break;
		case "two": // 값에 의한 비교이기 때문에 case "two"로 온다.
			System.out.println("two");
			break;
		default:
			System.out.println("default");
		}

	}

}
