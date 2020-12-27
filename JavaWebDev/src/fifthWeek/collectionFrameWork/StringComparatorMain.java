package fifthWeek.collectionFrameWork;

import java.util.TreeSet;

public class StringComparatorMain {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>(new StringComparator());
		tree.add("Box");
		tree.add("Rabbit");
		tree.add("Robot");
		
		for (String s : tree) {
			System.out.println(s.toString() + '\t');
		}
		System.out.println();
	}
}