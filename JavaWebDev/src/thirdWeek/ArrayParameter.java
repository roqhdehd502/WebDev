package thirdWeek;

public class ArrayParameter {

	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 6, 7};
		int sum = sumOfAry(ar); // 배열의 참조 값 전달
		System.out.println(sum);
		
		int len = 5;
		int[] newAry = makeNewIntAry(len);
		for (int i = 0; i < newAry.length; i++) {
			System.out.print(newAry[i] + " ");
		}
		System.out.println();
	}

	private static int sumOfAry(int[] ar) { // 배열의 모든 요소 값 합하기
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		return sum;
	}
	
	private static int[] makeNewIntAry(int len) { // 입력한 정수를 크기로 대입 후 배열 생성하기
		int[] ar = new int[len];
		return ar;
	}

}
