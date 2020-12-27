package fifthWeek.rec;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer n1, Integer n2) {
		if (n1 - n2 > 0) {
			return -1;
		} else if (n1 - n2 < 0) {
			return 1;
		} else {
			return 0;
		}
	}
}