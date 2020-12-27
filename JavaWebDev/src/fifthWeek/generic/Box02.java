package fifthWeek.generic;

public class Box02<T extends Eatable> {
	private T ob;

    public void set(T o) {
        ob = o;
    }
    
    // 한 입 먹고 반환하는 행위의 메소드로 수정
    public T get() {
        System.out.println(ob.eat());
        return ob;
    }   
}
