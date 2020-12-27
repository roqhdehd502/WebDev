package thirdWeek.rec;

import java.util.Random;

public class Matrix {
	private int[][] mat;
	private final int ROWS;
	private final int COLS;
	
	public Matrix () {
		ROWS = 4;
		COLS = 4;
		mat = new int[ROWS][COLS];
	}
	
	public int[][] getMat() {
		return mat;
	}

	public void setMat(int[][] mat) {
		this.mat = mat;
	}
	
	public void rndNum() {
		Random random = new Random();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = random.nextInt(10) + 1;
			}
		}
	}
	
	public void user() {
		rndNum();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
