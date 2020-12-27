package fifthWeek.collectionFrameWork;

import java.util.HashMap;

public class HashMap01 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		// Key-Value 기반 데이터 저장
		map.put(45, "Blown");
		map.put(37, "James");
		map.put(23, "Martin");
		map.put(23, "Lee"); // Key는 중복을 허용하지 않으므로 가장 최근에 추가한 Value만 반영된다.
		
		// 데이터 탐색
		System.out.println("23번: " + map.get(23));
		System.out.println("37번: " + map.get(37));
		System.out.println("45번: " + map.get(45));
		
		// 데이터 삭제
		map.remove(37);
		
		// 데이터 삭제 확인
		System.out.println("37번: " + map.get(37));
	}
}