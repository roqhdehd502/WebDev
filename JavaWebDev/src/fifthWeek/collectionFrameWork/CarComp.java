package fifthWeek.collectionFrameWork;

import java.util.Comparator;

public class CarComp implements Comparator<Car03> {
	@Override
    public int compare(Car03 o1, Car03 o2) {
        return o1.disp - o2.disp;
    }
}