package utils;

public class Matrix {

	public float[][] matrix;
	public int rows, columns;

	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		matrix = new float[rows][columns];
	}

	//fix this to return a matrix, adhere to matrix multiplication rules.
	public void multiply(Matrix other) {
		if(this.rows == other.columns && this.columns == other.rows){
			for(int r = 0; r < this.rows; r++){
				for(int c = 0; c < this.columns; c++){
					this.matrix[r][c] += other.matrix[c][r];
				}
			}
		}
	}

	public void multiply(float x) {
		for(int r = 0; r < this.rows; r++){
			for(int c = 0; c < this.columns; c++){
				this.matrix[r][c] *= x;
			}
		}
	}

	public float determinant() {
		if(this.rows == this.columns){
			if(this.columns == 1) return this.matrix[0][0];
			if(this.columns == 2){
				return this.matrix[0][0] * this.matrix[1][1] - this.matrix[1][0] * this.matrix[0][1];
			}
		}
		return 0;
	}

	public void add(Matrix other) {
		if (this.rows == other.rows && this.columns == other.columns) {
			for (int r = 0; r < this.rows; r++) {
				for (int c = 0; c < this.columns; c++) {
					this.matrix[r][c] += other.matrix[r][c];
				}
			}
		}
	}

	public void subtract(Matrix other) {
		if (this.rows == other.rows && this.columns == other.columns) {
			for (int r = 0; r < this.rows; r++) {
				for (int c = 0; c < this.columns; c++) {
					this.matrix[r][c] -= other.matrix[r][c];
				}
			}
		}
	}

}
