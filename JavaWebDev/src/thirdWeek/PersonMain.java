package thirdWeek;

public class PersonMain {

	public static void main(String[] args) {
		Person jung = new Person(335577, 112233); // 여권 있느 사람의 정보를 담은 인스턴스 생성
		
		Person hong = new Person(775544); // 여권 없는 사람의 정보를 담은 인스터늣 생성
		
		jung.showPersonalInfo();
		hong.showPersonalInfo();
	}

}
