public class FNumDAW {
	
	public static int potencia  (int base, int exponente) {
	
		int result = 1;
		
		for (int i = 1; i<=exponente;i++) result=result*base;
		
		return result;
		
	}
	public static int cuentaDigitos  (int num) {
	
		int digitos = 1;
		int trozo = num;
		
		if (num > 9) {
			do {
				trozo = trozo / 10;
				digitos ++;
			} while (trozo>=10);
		}
		return digitos;
		
	}
	public static int voltea  (int num) {
	
		int volteado = 0;
		int trozo = num;
		
		do {
			volteado = volteado*10+(trozo%10);
			trozo = (int)(trozo/10);
		} while (trozo>0);
		
		return volteado;
		
	}
	public static boolean esCapicua  (int num) {
	
		boolean esCapicua = false;
		
		if(voltea(num)==num) esCapicua = true;
		
		return esCapicua;
		
	}
	public static boolean esPrimo  (int num) {
	
		boolean esPrimo = true;
		int i = 2;
		
		if (num != 1)  {
		
			while (esPrimo && i < num) {
				
				if (num%i == 0) esPrimo = false;
				else i++;

			}
		
		} else esPrimo = false;	
			
		return esPrimo;

		
	}

	public static int siguientePrimo  (int num) {
	
		int nextPrime  = num + 1;
		
		while (!esPrimo(nextPrime)) nextPrime++;
			
		return nextPrime;
		
	}
	
	public static int anteriorPrimo  (int num) {

		int prevPrime  = num - 1;
		
		while (!esPrimo(prevPrime)) prevPrime--;
			
		return prevPrime;
		
	}
	public static int digitoN  (int num, int pos) {

		return (int)(num%potencia(10,cuentaDigitos(num)-pos) / potencia(10,cuentaDigitos(num)-pos-1));
		
	}
	public static int posicionDeDigito  (int num, int valor) {
	
		int pos = -1;

		for ( int i = 0; i<cuentaDigitos(num)&&pos == -1; i++) if (digitoN(num,i)==valor) pos = i;
				
		return pos;
			
	}
	public static int parteNumero  (int num, int ini, int fin) {
	
		return (int)(num%potencia(10,cuentaDigitos(num)-ini))/potencia(10,cuentaDigitos(num)-fin);
		
	}
	public static int pegaNumero   (int num1, int num2) {

		return num1*potencia(10,cuentaDigitos(num2)) + num2;
		
	}
	public static boolean kaprekar  (int num) {
	
		boolean kapre = false;

		int cuadrado = potencia(num, 2);
		
		int digitos = cuentaDigitos(cuadrado);

		if (parteNumero(cuadrado, 0, digitos/2) +
			parteNumero(cuadrado, digitos/2, digitos) == num) kapre = true;

		return kapre;
	
		
	}


	
}