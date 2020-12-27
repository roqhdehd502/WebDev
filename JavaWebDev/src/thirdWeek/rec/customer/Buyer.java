package thirdWeek.rec.customer;

import java.util.Arrays;

public class Buyer {
	int money = 1000; // 구입한 제품을 저장하기 위한 배열
	int i = 0;
	Product[] cart = new Product[3]; // Product 배열 cart에 사용될 index

	void buy(Product p) {
		if (money < p.price) { // 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료
			System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
			return;
		} else { // 가진 돈이 충분하면
			money -= p.price; // 제품의 가격을 가진 돈에서 빼고
			add(p); // 장바구니에 구입한 물건을 담는다.
		} 
	}

	void add(Product p) {
		if (i >= cart.length) { // i의 값이 장바구니의 크기보다 같거나 크면
			Product[] cart2 = new Product[cart.length * 2]; // 기존의 장바구니보다 2배 큰 새로운 배열을 생성
			System.arraycopy(cart, 0, cart2, 0, cart2.length);
			cart2 = Arrays.copyOf(cart, cart.length); // 기존의 장바구니의 내용을 새로운 배열에 복사
			cart = cart2; // 새로운 장바구니와 기존의 장바구니를 바꾼다
			cart[i++] = p; // 물건을 장바구니에 저장하고 i의 값을 1 증가시킨다
		}
	}

	void summary() {  // Problem Method
		int sum = 0;
		String itemList = "";
	
		for (i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				break;
			} else {
				itemList += cart[i].toString() + ", "; // 장바구니에 담긴 물건들의 목록
				sum += cart[i].price;
			}
		}
		
		System.out.println("구입한 물건: " + itemList); // 장바구니 목록 출력
		System.out.println("사용한 금액: " + sum); // 장바구니에 담긴 물건들의 가격을 모두 더해서 출력
		System.out.println("남은 금액: " + money); // 물건을 사고 남은 금액을 출력
	}
}