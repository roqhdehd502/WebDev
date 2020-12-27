package fourthWeek;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		int[] ar = {33, 55, 11, 44, 22};
		Arrays.sort(ar); // 탐색 이전에 정렬이 선행되어야 한다.
		
		for (int n : ar) {
			System.out.println(n + "\t");
		}
		System.out.println();
		
		int idx = Arrays.binarySearch(ar, 33); // 배열 ar에서 33을 찾아라.
		System.out.println("Index of 33: " + idx); // 33에 해당되는 배열 인덱스 번호 출력

	}

}
