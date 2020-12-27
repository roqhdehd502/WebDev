package secondWeek.rec.animal;

public class Dog {
	public void welcome(secondWeek.rec.zoo.Cat c) {
		c.makeSound(); // public 접근 제한자로 액세스 승인
		
		//c.makeHappy(); // default 접근 제한자로 액세스 거부
	}
}