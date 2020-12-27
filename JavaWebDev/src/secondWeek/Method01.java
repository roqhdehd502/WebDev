package secondWeek;

public class Method01 {
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		System.out.println();
		hiEveryone();
		introduce(27, "나민우"); // 함수는 선언하면 반드시 호출한다!!!
		System.out.println();
		System.out.println("프로그램의 끝");
	}

	private static void hiEveryone() {
		System.out.println("좋은 아침입니다.");
	}

	private static void introduce(int age, String name) {
		System.out.println("제 나이는 " + age + "세입니다.");
		System.out.println("그리고 이름은 " + name + "입니다.");
	}
}