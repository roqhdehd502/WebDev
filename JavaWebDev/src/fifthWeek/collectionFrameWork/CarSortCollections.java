package fifthWeek.collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CarSortCollections {

	public static void main(String[] args) {
		List<Car02> list = new ArrayList<>();
		list.add(new Car02(1200));
		list.add(new Car02(3000));
		list.add(new Car02(1800));
		
		// 정렬
		Collections.sort(list);
		
		// 출력
		for (Iterator<Car02> itr = list.iterator(); itr.hasNext();) {
			System.out.println(itr.next().toString() + '\t');
		}
	}

}
