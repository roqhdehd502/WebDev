package thirdWeek.rec.television;

public class MyCake {

	public static void main(String[] args) {
		Cake c1 = new StrawberryCheeseCake(); // 조부모 = 손주
		CheeseCake c2 = new StrawberryCheeseCake(); // 부모 = 자식
		StrawberryCheeseCake c3 = new StrawberryCheeseCake(); // 자식 = 자식
		
		c1.yummy();
		c2.yummy();
		c3.yummy();
	}

}
