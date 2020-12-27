package fifthWeek.collectionFrameWork;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(3); tree.add(1);
		tree.add(2); tree.add(4);
		System.out.println("인스턴스 수: " + tree.size());
		
		// foreach문에 의한 반복
		for (Integer n : tree) {
			System.out.print(n.toString() + '\t'); // 정렬된채 출력
		}
		System.out.println();
		
		// Iterator 반복자에 의한 반복
		for (Iterator<Integer> itr = tree.iterator(); itr.hasNext();) {
			System.out.print(itr.next().toString() + '\t');
		}
		System.out.println();
	}

}
