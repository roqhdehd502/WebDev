package fifthWeek.generic;

public class BoxHandler {
	public static void outBox(Box04<? extends Toy> box) { // 상한 제한
        Toy t = box.get();    // 박스에서 꺼내기
        System.out.println(t);
    }

    public static void inBox(Box04<? super Toy> box, Toy n) { // 하한 제한
        box.set(n);    // 박스에 넣기
    } 
}