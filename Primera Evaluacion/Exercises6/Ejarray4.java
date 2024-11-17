public class Ejarray4 {

	public static void main(String[] args){
		int[][] matriz = new int[8][6];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = 0;
				matriz[i][0] = 1;
				matriz[0][j] = 1;
				matriz[i][5] = 1;
				matriz[7][j] = 1;
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}

	}

}