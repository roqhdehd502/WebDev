package fifthWeek.collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Search01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Box");
		list.add("Robot");
		list.add("Apple");
		System.out.println(list); // 정렬하지 않은 결과 출력
		
		Collections.sort(list); // 선 정렬
		int idx = Collections.binarySearch(list, "Robot"); // 후 탐색
		System.out.println(list.get(idx)); // 탐색 결과 출력
	}

}
