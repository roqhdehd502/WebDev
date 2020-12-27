package fourthWeek.rec;

public class StackApp implements Stack {
	private int top; // 스택의 맨 위 부분
	private int size; // 입력할 저장 공간의 크기를 입력할 수
	private String str[]; // 입력할 문자열을 담는 객체
	
	public StackApp(int size) {
		top = -1;
		this.size = size;
		str = new String[this.size];
	}

	@Override
	public int length() { // 현재 스택에 저장된 개수 리턴
		return top;
	}

	@Override
	public int capacity() { // 스택의 전체 저장 가능한 개수 리턴
		return size;
	}

	@Override
	public String pop() {  // 스택의 톱(top)에 스트링을 pop
		if (length() == -1) 
			System.out.println("스택에 데이터가 없습니다!");
		
		return str[--top]; // LIFO 형태에 따라 top 부터 pop
	}

	@Override
	public boolean push(String pustr) { // 스택의 톱(top)에 스트링을 push
		if (top == (this.size - 1)) {
			System.out.println("스택이 꽉 차서 푸시 불가!");
			return false;
		} else {
			str[++top] = pustr;    // 다음 스택 포인터가 가리키는 인덱스에 데이터 추가
		}
		
		return true;
	}

	public void printStack() { // 스택에 저장된 모든 문자열 출력
		if (length() == -1) {
			System.out.println("스택에 데이터가 없습니다!");
		} else {
			System.out.print("스택에 저장된 모든 문자열 팝 : ");
			for (int i = 0; i <= top; i++) {
				System.out.print(str[i] + " ");
			}
			System.out.println();
		}
	}
}