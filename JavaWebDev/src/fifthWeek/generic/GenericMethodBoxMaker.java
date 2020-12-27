package fifthWeek.generic;

public class GenericMethodBoxMaker {

	public static void main(String[] args) {
		Box03<String> sBox = BoxFactory.makeBox("Sweet");
        System.out.println(sBox.get());

        Box03<Double> dBox = BoxFactory.makeBox(7.59);
        System.out.println(dBox.get());
	}
}