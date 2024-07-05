import java.util.Scanner;

public class Ej3 {
	
	public static void main (String[] args) {
	
		int[][] mat = new int[4][4];
		boolean simetrica;
		Scanner sc  =new Scanner (System.in);
		
		//Rellena
		for(int i = 0; i<4; i++) {
			for (int j = 0; j<4; j++) {
				System.out.print("("+i+","+j+"): ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		//Pinta la matriz y calcula
		simetrica = true;		
		for(int i = 0; i<4; i++) {
			for (int j = 0; j<4; j++) {
				System.out.print(mat[i][j]);
				if(mat[i][j] != mat[j][i]) simetrica = false;
			}
			System.out.println();
		}
		
		System.out.println(simetrica?"Simetrica":"No simetrica");
		
	}
	
}