package fifthWeek.collectionFrameWork;

import java.util.LinkedList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// 객체를 호춣할 때, 제네릭 키워드의 매개변수에 따라 적재적소로 타입을 설정할 수 있다.
		List<String> list = new LinkedList<>(); 
		
		// 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		// 전체 인스턴스 참조
		for (String s : list) {
			System.out.println(s + '\t');
		}
	}

}
