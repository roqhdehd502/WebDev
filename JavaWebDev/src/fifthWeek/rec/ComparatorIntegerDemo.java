package fifthWeek.rec;

import java.util.TreeSet;

public class ComparatorIntegerDemo {

	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<>(new IntegerComparator());
		tr.add(30);
		tr.add(10);
		tr.add(20);
		System.out.println(tr);
	}
}