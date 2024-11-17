import java.util.Scanner;
import java.util.Arrays;

public class Campominas {
	
	public static void main (String[] args) {

		char[][] tab = new char[20][20];
		int row;
		int col;
		int rowa;
		int rowp;
		int cola;
		int colp;
		boolean repe;
		
		//Inicializa
		for (int i=0;i<20;i++) {
			for (int j=0;j<20;j++) {
				tab[i][j] = '_';
			}
		}
		
		for (int i = 1; i<=50;i++){
		
			do {
				repe = false;
				row = (int)(Math.random()*20);
				col = (int)(Math.random()*20);
				
				if ((row==0&&col==0)||(row==0&&col==1)||
				     (row==1&&col==0)||(row==1&&col==1)) repe = true;
				
				if(col>0) 		cola=col-1; 	else cola = col;
				if(col<19)	colp=col+1;	else colp = col;
				if(row>0) 	rowa=row-1;	else rowa = row;
				if(row<19) 	rowp=row+1;	else rowp = row;
				
				if (tab[rowa][cola]=='*'||tab[rowa][col]=='*'||tab[rowa][colp]=='*'||
				     tab[row][cola]=='*'||tab[row][col] == '*'||tab[row][colp]=='*'||
				     tab[rowp][cola]=='*'||tab[rowp][col]=='*'||tab[rowp][colp]=='*') repe = true;
				
			} while (repe);

			tab[row][col] = '*';
		
		}
		
		//Pinta
		for (int i=0;i<20;i++) {
			for (int j=0;j<20;j++) {
				System.out.print(tab[i][j]);
			}
			System.out.println();
		}		
		
	}	
		
}