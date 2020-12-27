package fifthWeek.collectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap02 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		// Key만 감고 있는 컬렉션 인스턴스 생성
		Set<Integer> ks = map.keySet();
		
		// 전체 Key 출력 (foreach)
		for (Integer n : ks) {
			System.out.print(n.toString() + '\t');
		}
		System.out.println();
		
		// 전체 Value 출력 (foreach)
		for (Integer n : ks) {
			System.out.print(map.get(n).toString() + '\t');
		}
		System.out.println();
		
		// 전체 Value 출력 (Iterator)
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
			System.out.print(map.get(itr.next()) + '\t');
		}
		System.out.println();
	}
}