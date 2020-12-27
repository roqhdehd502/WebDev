package fourthWeek.rec.ArraySort;

import java.util.Arrays;

public class ArrayObjSearch {

	public static void main(String[] args) {
		Person[] ar = new Person[3];
		
        ar[0] = new Person("HyunJin Ryu", 33);
        ar[1] = new Person("KwangHyun Kim", 32);
        ar[2] = new Person("JiMan Choi", 29);
        
        System.out.println("Unordered");
        for (int i = 0; i < ar.length; i++) {
        	System.out.println(ar[i]);
		}
        System.out.println();

        Arrays.sort(ar); // Sorting(ASC)
        System.out.println("Ordered");
        for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
        }
	}
}