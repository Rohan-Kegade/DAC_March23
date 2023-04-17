package in.cdac.main;

import java.util.Scanner;

public class MatrixTest {
private static Scanner sc = new Scanner(System.in);
			
	public boolean transpose() {
		// TODO Auto-generated method stub
		System.out.println("Enter details of Matrix 1");
		int[][] mat1 = getMatrix();
		if (mat1 == null)
			return false;
		int result [][] = Matrix.transpose(mat1);
		if (result ==  null)
			return false;
		Matrix.display(result);
		return true;		
	}

	public boolean multiplication() {
		// TODO Auto-generated method stub
		System.out.println("Enter details of Matrix 1");
		int[][] mat1 = getMatrix();
		if (mat1 == null)
			return false;
		System.out.println("Enter details of Matrix 2");
		int[][] mat2 = getMatrix();
		if (mat2 == null)
			return false;
	
		int result [][] = Matrix.multiply(mat1, mat2);
		if (result ==  null)
			return false;
		Matrix.display(result);
		return true;		
	}

	public boolean subtract() {
		System.out.println("Enter details of Matrix 1");
		int[][] mat1 = getMatrix();
		if (mat1 == null)
			return false;
		System.out.println("Enter details of Matrix 2");
		int[][] mat2 = getMatrix();
		if (mat2 == null)
			return false;
	
		int result [][] = Matrix.subtract(mat1, mat2);
		if (result ==  null)
			return false;
		Matrix.display(result);
		return true;		
	}

	public int[][] getMatrix(){
		System.out.println("Enter number of rows of matrix ");
		int row = sc.nextInt();
		System.out.println("Enter number of cols of matrix ");
		int col = sc.nextInt();
		if (row < 1 || col < 1) {
			System.out.println("Invalid row or column");
			return null;
		}
		int matrix [][] = new int[row][col];
		System.out.println("Enter the elements of matrix");
		for (int i = 0;  i < row ;  i++) {
			for (int j = 0; j< col ; j++) {
				System.out.print("Enter element["+i+"]["+j+"]");
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}

	public boolean add() {
		// TODO Auto-generated method stub
		System.out.println("Enter details of Matrix 1");
		int[][] mat1 = getMatrix();
		if (mat1 == null)
			return false;
		System.out.println("Enter details of Matrix 2");
		int[][] mat2 = getMatrix();
		if (mat2 == null)
			return false;
	
		int result [][] = Matrix.add(mat1, mat2);
		if (result ==  null)
			return false;
		Matrix.display(result);
		return true;
	}
}
