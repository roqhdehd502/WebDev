package fifthWeek.collectionFrameWork;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

public class CarComparator {

	public static void main(String[] args) {
		List<Car03> clist = new ArrayList<>();
		clist.add(new Car03(1800));
		clist.add(new Car03(1200));
		clist.add(new Car03(3000));

		List<ECar> elist = new ArrayList<>();
		elist.add(new ECar(3000, 55));
		elist.add(new ECar(1800, 87));
		elist.add(new ECar(1200, 99));

		CarComp comp = new CarComp();

		// 각각 정렬
		Collections.sort(clist, comp);
		Collections.sort(elist, comp);


		// 각각 출력
		for(Iterator<Car03> itr = clist.iterator(); itr.hasNext(); )
			System.out.println(itr.next().toString() + '\t');
		System.out.println();

		for(Iterator<ECar> itr = elist.iterator(); itr.hasNext(); )
			System.out.println(itr.next().toString() + '\t');
	}
}