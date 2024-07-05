import java.util.Scanner;

public class Ej1 {
	
	public static void main (String[] args) {
	
		int[] num = new int[15];
		int aux;
		
		Scanner sc = new Scanner(System.in);
		
		//Rellenar Array
		for(int i = 0; i<num.length ; i++) {
			System.out.print("Dame el "+i+": ");
			num[i] =  sc.nextInt();
		}
		
		//Rotar
		aux = num[num.length-1];
		for(int i = num.length-1; i>0 ; i--) {
			num[i] = num[i-1];
		}
		num[0] = aux;
		
		//Pintar resultado
		for(int i = 0; i<num.length ; i++) {
			System.out.println(num[i]);
		}
		
	}
	
}