package fifthWeek.collectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AsListcollection {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		
		for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + '\t');
		}
		System.out.println();
		
		for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
			if (itr.next().equals("Box")) { // 배열 요소에 Box가 있으면
				itr.remove(); // 해당 내용 remove하기
			}
		}
		
		for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + '\t');
		}
		System.out.println();
	}
}