package secondWeek;

public class Star {

	public static void main(String[] args) {
		System.out.println("5열 종대로 별을 찍습니다.");
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("n열 종대로 별을 찍습니다.");
		int n = 10;
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("계단식으로 별을 찍습니다.");
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("역 계단식으로 별을 찍습니다.");
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("계단식으로 별을 반전하여 찍습니다.");
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("역 계단식으로 별을 반전하여 찍습니다.");
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("피라미드식으로 별을 찍습니다.");
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}