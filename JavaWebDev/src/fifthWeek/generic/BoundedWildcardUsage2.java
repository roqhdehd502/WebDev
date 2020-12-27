package fifthWeek.generic;

public class BoundedWildcardUsage2 {

	public static void main(String[] args) {
		Box04<Toy> box = new Box04<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box); 
	}
}