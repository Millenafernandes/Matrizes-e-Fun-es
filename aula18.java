package javaAula;
import java.util.Scanner;

public class aula18 {
	
	public static void main(String[] args) {
		
		int matrix [][] = preencheMatrix();
		
		imprimiMatrix(matrix);
		
		
		Scanner nil = new Scanner(System.in);
		
		/*Scanner nil = new Scanner(System.in);
		
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix[0].length; j++) {
				
				matrix[i][j] = nil.nextInt();
				
				
			}
		}
		
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix[0].length; j++) {
				
				System.out.print(matrix[i][j] + "\t");
				
				
			}
			
			System.out.println();
		}*/
		
		
		
	}	
		
		public static int[][] preencheMatrix() {
			
			int matrix [][] = new int[2][3];
			Scanner nil = new Scanner(System.in);
			
			
			for(int i = 0; i<matrix.length; i++) {
				for(int j = 0; j<matrix[0].length; j++) {
					
					matrix[i][j] = nil.nextInt();
					
					
				}
			}
			
			return matrix;
			
		}
		
		public static void imprimiMatrix(int matrix[][]) {
			
			
			
			
			for(int i = 0; i<matrix.length; i++) {
				for(int j = 0; j<matrix[0].length; j++) {
					
					System.out.print(matrix[i][j] + "\t");
					
					
				}
				
				System.out.println();
			}
			
			
		}
		
	}


