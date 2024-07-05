import java.util.Scanner;

public class Ej4 {
	
	public static void main (String[] args) {
	
		int[][] mat = new int[8][6];
		
		//Creo
		for(int i = 0; i < 8 ; i++) {
			for(int j = 0; j < 6 ; j++) {
				if(i==0||j==0||i==7||j==5) 	mat[i][j] = 1;
				else				   		mat[i][j] = 0;
			}
		}
	
		//Pinto
		for(int i = 0; i < 8 ; i++) {
			for(int j = 0; j < 6 ; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		
	}
	
}