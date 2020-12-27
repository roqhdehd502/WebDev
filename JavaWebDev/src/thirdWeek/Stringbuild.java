package thirdWeek;

public class Stringbuild {

	public static void main(String[] args) {
		// 문자열 "123"이 저자오딘 인스턴스의 생성
		StringBuilder stbuf = new StringBuilder("123");
		
		stbuf.append(45678); // 문자열 덧붙이기
		System.out.println(stbuf.toString());
		
		stbuf.delete(0, 2); // 문자열 일부 삭제
		System.out.println(stbuf.toString());
		
		stbuf.replace(0, 3, "AB"); // 문자열 일부 교체
		System.out.println(stbuf.toString());
		
		stbuf.reverse(); // 문자열 내용 뒤집기
		System.out.println(stbuf.toString());
		
		String sub = stbuf.substring(2, 4); // 일부만 문자열로 변환
		System.out.println(sub);
	}

}
