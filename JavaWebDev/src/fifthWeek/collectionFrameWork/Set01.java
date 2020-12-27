package fifthWeek.collectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Toy"); set.add("Box");
		set.add("Robot"); set.add("Box"); // 중복 요소가 있기때문에 하나만 적용된다!
		System.out.println("인스턴스 수: " + set.size());
		
		// 반복자를 이용한 전체 출력
		for (Iterator<String> itr = set.iterator(); itr.hasNext();) {
			System.out.println(itr.next() + '\t');
		}
		System.out.println();
		
		// foreach문을 이용한 전체 출력
		for (String s : set) {
			System.out.println(s + '\t');
		}
		System.out.println();
	}
}