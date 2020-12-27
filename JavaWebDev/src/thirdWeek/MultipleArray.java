package thirdWeek;

public class MultipleArray {

	public static void main(String[] args) {
		int[][] arr1 = {
				{11, 22, 33},
				{44, 55, 66},
				{77, 88, 99}
		};
		
		int[][] arr2 = {
				{11},
				{22, 33},
				{44, 55, 66}
		};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
