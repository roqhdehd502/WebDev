package fifthWeek.rec;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;
//import java.util.Iterator;

public class LottoMain {

	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> set = new HashSet<>();
		
		for (int i = 1; i <= 6; i++) // 로또 번호 6개 랜덤으로 받기
			set.add(random.nextInt(45) + 1);
		
		System.out.println("Your Lotto Number");
		System.out.println(set);
		/*
		for (Iterator<Integer> itr = set.iterator(); itr.hasNext();) // 받은 로또번호 출력하기
			System.out.print(itr.next() + " ");
		System.out.println();
		*/
	}
}