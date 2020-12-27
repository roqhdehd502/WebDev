package firstWeek;

public class Counter {

	public static void main(String[] args) {
		/*
		// 만족하는 값을 찾기
		int num = 1; // 값을 1로 초기화
		boolean search = false; // 값은 false로 초기화
		
		while (num < 100) { // num이 100이 되면 탈출
			if (((num % 5) == 0) && ((num % 7) == 0)) { // num이 5의 배수이자 7의 배수일 때,
				search = true; // search값은 true가 되어
				break; // while 루프문을 탈출한다.
			}
			num++; // if문을 만족하지 못하면 증가 연산자에 의해 num이 증가한다.
		}
		if (search == true) { // search 값이 true일 때
			System.out.println("찾는 정수: " + num); // break에 의해 while문을 탈출한 num을 출력하고
		} else { // search 값이 false일 때
			System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다."); // num이 100이 되어 while문을 탈출한 결과를 출력한다.
		}
		*/
		// 만족하는 값의 카운트를 찾기
		int num = 0; // num 0으로 초기화
		int count = 0; // count 0으로 초기화
		
		while (num++ < 100) { // num이 증가연산하여 100이 되면 탈출
			if (((num % 5) != 0) || ((num % 7) != 0)) { // num이 5의 배수가 아니고 혹은 7의 배수가 아닐 때,
				continue; // continue로 인해 num++이 되어 다시 루프
			}
			count++; // if문을 만족시키지 않으면 count가 증가
			System.out.println(num); // if문을 만족시키지 않은 num값을 반복 출력
		}
		System.out.println("count: " + count); // 루프문을 탈출한 count값을 출력
	}

}
