package libreria; //está en la carpeta libreria
import java.util.Random;
import java.util.Scanner;

public class FNumDaw {
    public static double potencia (double base, int exponente) {
       double resultado = Math.pow(base, exponente);
       return resultado;
    }
    
    public static int cuantosDigitos (int digitos) {
        int cant = 0;

        while (digitos > 0){
            digitos = digitos /10;
            cant++;
        }
        return cant;
    }

    public static int voltea(int num) {
        String StringNum = Integer.toString(num);
        String StringNumInvert = new StringBuilder(StringNum).reverse().toString();
        int numeroinvertido = Integer.parseInt(StringNumInvert);
        return numeroinvertido;
    }

    public static boolean esCapicua (int num) {
        int numInvert = voltea(num);
        boolean es = true;
        if (numInvert == num) {
            es = true;
        }else {
            es = false;
        } return es;
    }

    public static boolean esPrimo (int n) {      
        for (int i = n -1; i > 1; i--) {
            if (n % i == 0) {
                return false;
            }
        }return true;
    }

    public static int siguientePrimo (int prim) {
        prim++;
        while (true) {
            esPrimo(prim);
            if (esPrimo(prim)) {
                return prim;
            }else {
                prim++;
            }
        } 
    }

    public static int anteriorPrimo (int antprim) {
        antprim--;
        while (true) {
            esPrimo(antprim);
            if (esPrimo(antprim)) {
                return antprim;
            }else {
                antprim--;
            }
        }
    }

    public static char digitoN (int digito, int posicion) {
        String numerodigito = String.valueOf(digito);

        char[] algo = numerodigito.toCharArray();

        return algo[posicion];
    }

    public static String posicionDeDigito(int numero, int posicion1) {
        String temp = Integer.toString(numero);
        char[] cadena = temp.toCharArray();
        for (int x = 0; x < cadena.length; x++) {
            if (cadena[x] == Integer.toString(posicion1).charAt(0)) {
                return "La primera ocurrencia de " + posicion1 + " se encuentra en la posicion: " + x;
            }
        }
        return "-1";
    }

    public static StringBuilder parteNumero (int numero, int inicio, int fin) {
        String numeros = Integer.toString(numero);
        char[] array = numeros.toCharArray();
        StringBuilder a = new StringBuilder();
        for(int i = inicio; i < fin; i++) {
            a.append(array[i]);
        } return a;
    }

    public static String pegaNumeros (int num1, int num2) {
        return num1 + "" + num2;
    }

    public static boolean kaprekar (int num) {
        int num1 = num * num;
        String mitad = Integer.toString(num1);
        int longitud = (mitad.length() / 2) - 1;
        int division = mitad.length() - 1;
        StringBuilder mitadizquierda = parteNumero(num1, 0, longitud);
        StringBuilder mitadderecha = parteNumero(num1, longitud + 1, division);

        if (Integer.parseInt(String.valueOf(mitadizquierda)) == (Integer.parseInt(String.valueOf(mitadderecha)))) {
            return true;
        }
        return false;
    }

    public static int[] generaArrayInt (int tamanyo, int minimo, int maximo) {
        int[] aleatorio = new int[tamanyo];
        Random random = new Random();
        for (int i = 0; i < tamanyo; i++) {
            aleatorio[i] = random.nextInt(maximo - minimo + 1) + minimo;     
        } 
        return aleatorio;
    }

    public static int minimoArrayInt (int[] a) {
        int numero = 2147483647;
        for (int x = 0; x < a.length; x++) {
            if (a[x] < numero) {
                numero = a[x];
            }
        }
        return numero;
    }

    public static int maximoArrayInt (int[] b) {
        int numero = -2147483647;
        for (int x = 0; x < b.length; x++) {
            if (b[x] > numero) {
                numero = b[x];
            }
        }
        return numero;
    }

    public static int mediaArrayInt (int tamanyo3) {
        int[] d = new int[tamanyo3];
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        for (int z = 0; z < d.length; z++) {
            System.out.println("Dime la posicion " + z + " del array:");
            d[z] = sc.nextInt();
            suma = suma + d[z];
        }
        return suma / d.length;
    }


    public static boolean estaEnArrayInt (int tamanyo, int dentro) {
        int[] c = new int[tamanyo];
        int i;
        for (i = 0; i < c.length; i++) {
            c[i] = (int) (Math.random() * tamanyo);
        }
        int pasar = c[i -1];
        if (pasar == dentro) {
            return true;
        }
        return false;
    }

    public static int posicionArray (int[] c, int nump) {
        System.out.println(c[nump]);
        return nump;
    }

    public static int[] volteaArrayInt (int[] d) {
        int inicio = 0;
        int fin = d.length - 1;

        while (inicio < fin) {

            int temp = d[inicio];
            d[inicio] = d[fin];
            d[fin] = temp;

            inicio++;
            fin--;
        }
        return d;
    }
}
