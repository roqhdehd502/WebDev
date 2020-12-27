package fifthWeek.collectionFrameWork;

import java.util.HashSet;

public class HowHashCode {

	public static void main(String[] args) {    
        HashSet<Car> set = new HashSet<>();
        set.add(new Car("HY_MD_301", "RED"));
        set.add(new Car("HY_MD_301", "BLACK"));
        set.add(new Car("HY_MD_302", "RED"));
        set.add(new Car("HY_MD_302", "WHITE"));
        set.add(new Car("HY_MD_301", "BLACK"));

        System.out.println("인스턴스 수: " + set.size());

        for(Car car : set)
            System.out.println(car.toString() + '\t');
    }
}