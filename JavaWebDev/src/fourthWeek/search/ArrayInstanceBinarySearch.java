package fourthWeek.search;

import java.util.Arrays;

public class ArrayInstanceBinarySearch {

	public static void main(String[] args) {
		Person[] ar = new Person[3];
		
		ar[0] = new Person("Lee", 29);
		ar[1] = new Person("Goo", 15);
		ar[2] = new Person("Soo", 37);
		
		Arrays.sort(ar);
		// 인스턴스 대상으로 이진탐색
		int idx = Arrays.binarySearch(ar, new Person("Who are you?", 37));
		System.out.println(ar[idx]);
	}
}