
import libreria.FNumDaw;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean seguir = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Estos son los programas que puedo ejecutar:");
        System.out.println( "1. Doy la potencia de una base y un exponente.          \n " +
                "2. Cuento el número de digitos de un número.           \n " +
                "3. Le doy la vuelta a un número.                       \n " +
                "4. Digo si un número es o no capicua.                  \n " +
                "5. Digo si un número es o no primo.                    \n " +
                "6. Doy el primo mayor al número que me dan.            \n " +
                "7. Doy el primo menor al número que me dan.            \n " +
                "8. Doy el digito de una posición de un número.         \n " +
                "9. Doy la posición de un digito.                       \n " +
                "10. Cojo el inicio y el fin de un número.              \n " +
                "11. Pego dos números para formar uno.                  \n " +
                "12. Kaprekar.                                          \n " +
                "13. Muestro los primos entre 1 y 1000.                 \n " +
                "14. Muestro los números capicua entre 1000 y 9999.     \n " +
                "15. 210 de Acepta el reto.                             \n " +
                "16. 100 y 115 de Acepta el reto.                       \n " +
                "17. Genero un array con el minimo y maximo que me digas\n " +
                "18. Genero un array y te digo el mínimo que tú me digas\n " +
                "19. Genero un array y te digo el máximo que tú me digas\n " +
                "20. Genero un array y te digo la media de este         \n " +
                "21. Digo si un número está o no dentro de un array     \n " +
                "22. Busco un número en un array y digo dónde está      \n " +
                "23. Le doy la vuelta a un array                        \n "
        );

        while (seguir) {
            System.out.println("Cuál de todos quieres probar?");
            int elegir = sc.nextInt();

            switch(elegir) {

                case 1:

                    System.out.println("Dame la base y el exponente de la operación:");
                    double base = sc.nextInt();
                    int exponente = sc.nextInt();

                    System.out.println(FNumDaw.potencia(base, exponente));

                    System.exit(0);

                break;

                case 2:

                    System.out.print("Dime de que número quieres saber la longitud: ");
                    int cant = sc.nextInt();

                    System.out.println(FNumDaw.cuantosDigitos(cant));

                    System.exit(0);

                break;

                case 3:

                    System.out.println("Dime a que número quieres darle la vuelta:");
                    int numeroinvertido = sc.nextInt();

                    System.out.println(FNumDaw.voltea(numeroinvertido));


                break;

                case 4:

                    System.out.println("Dime que número quieres saber si es capicua:");
                    int num = sc.nextInt();

                    System.out.println(FNumDaw.esCapicua(num));

                    System.exit(0);

                break;

                case 5:

                    System.out.println("Dime que número quieres saber si es primo:");
                    int n = sc.nextInt();

                    System.out.println(FNumDaw.esPrimo(n));

                    System.exit(0);

                break;

                case 6:

                    System.out.println("Dame un número primo y te daré el siguiente:");
                    int prim = sc.nextInt();

                    System.out.println(FNumDaw.siguientePrimo(prim));

                    System.exit(0);

                break;

                case 7:

                    System.out.println("Dame un número primo y te daré el anterior:");
                    int antprim = sc.nextInt();

                    System.out.println(FNumDaw.anteriorPrimo(antprim));

                    System.exit(0);

                break;

                case 8:

                    System.out.print("Dime el número del que quieres extraer un digito: ");
                    int digito = sc.nextInt();

                    System.out.println("Dime la posición que quieres que saque (siendo 0 la posición inicial): ");
                    int posicion = sc.nextInt();

                    System.out.println(FNumDaw.digitoN(digito, posicion));
                    System.exit(0);

                break;

                case 9:

                    System.out.println("Dime el numero:");
                    int numeroasacar = sc.nextInt();
                    System.out.println("Dime la posicion que quieres sacar:");
                    int posicion1 = sc.nextInt();

                    System.out.println(FNumDaw.posicionDeDigito(numeroasacar, posicion1));

                    System.exit(0);

                break;

                case 10:

                    System.out.print("Dime el número al que quieres sacarle un trozo:");
                    int numero = sc.nextInt();
                    System.out.println("Dime el inicio del trozo:");
                    int inicio = sc.nextInt();
                    System.out.println("Dime el final del trozo:");
                    int fin = sc.nextInt();

                    System.out.println(FNumDaw.parteNumero(numero, inicio, fin));
                    System.exit(0);

                break;

                case 11:

                    System.out.print("Dime el primer número que quieres juntar: ");
                    int num1 = sc.nextInt();
                    System.out.print("Dime el segundo número que quieres juntar: ");
                    int num2 = sc.nextInt();

                    System.out.println(FNumDaw.pegaNumeros(num1, num2));

                    System.exit(0);

                break;

                case 12:

                    System.out.print("Dime un número que quieras saber si es de kaprekar: ");
                    int kaprekar = sc.nextInt();

                    System.out.println(FNumDaw.kaprekar(kaprekar));

                    System.exit(0);

                break;

                //case 13:
//
                //    System.out.println("Te voy a mostrar los numeros primos del 1 al 1000: ");
                //
//
                //    FNumDaw.mil(int i);
                //    System.exit(0);
//
                //break;

                //case 14:
                //
                //    System.out.println("Te voy a mostrar los numeros capicua del 1000 al 9999: ");
                //    int dentro = sc.nextInt();
//
                //    System.out.println(FNumDaw.capicua());
                //    System.exit(0);
//
                //break;

                case 16:

                    System.out.println("Dime el numero que quieras saber las vueltas para llegar a 6174:");
                    int numkaprekar = sc.nextInt();


                break;

                case 17:

                    System.out.print("Marca el tamanyo para un array: ");
                    int tamanyo = sc.nextInt();
                    System.out.println("Dime el tamanyo minimo del array:");
                    int minimo = sc.nextInt();
                    System.out.println("Dime el tamanyo maximo del array:");
                    int maximo = sc.nextInt();
                    int[] temp = FNumDaw.generaArrayInt(tamanyo, minimo, maximo);
                    for (int i = 0; i < temp.length; i++) {
                        System.out.println(temp[i]);
                    }
                    System.out.println(FNumDaw.generaArrayInt(tamanyo, minimo, maximo));
                    System.exit(0);

                break;

                case 18:

                    System.out.println("Dime de que tamanyo quieres el array: ");
                    int tamanyo1 = sc.nextInt();
                    int[] a = new int[tamanyo1];
                    for (int x = 0; x < tamanyo1; x++) {
                        System.out.println("Dime el caracter " + x + " del array:");

                        a[x] = sc.nextInt();
                    }
                    System.out.println(FNumDaw.minimoArrayInt(a));
                    System.exit(0);

                break;

                case 19:

                    System.out.println("Dime de que tamanyo quieres el array: ");
                    int tamanyo2 = sc.nextInt();
                    int[] b = new int[tamanyo2];
                    for (int x = 0; x < tamanyo2; x++) {
                        System.out.println("Dime el caracter " + x + " del array:");

                        b[x] = sc.nextInt();
                    }
                    System.out.println(tamanyo2);
                    System.exit(0);

                break;

                case 20:

                    System.out.println("Dime el tamanyo del array:");
                    int tamanyo3 = sc.nextInt();


                    System.out.println(FNumDaw.mediaArrayInt(tamanyo3));

                break;

                case 21:

                    System.out.println("Dime de que tamanyo quieres que sea el array:");
                    tamanyo = sc.nextInt();
                    System.out.println("Escribe el número que quieras saber si está dentro del array:");
                    int dentro = sc.nextInt();

                    System.out.println(FNumDaw.estaEnArrayInt(tamanyo, dentro));

                    System.exit(0);

                break;

                case 22:

                    System.out.println("Dime de que tamanyo quieres el array:");
                    int tamanyo4 = sc.nextInt();
                    int[] c = new int[tamanyo4];
                    for (int i = 0; i < tamanyo4; i++) {
                        System.out.println("Dime el caracter " + i + " del array:");

                        c[i] = sc.nextInt();

                    }
                    System.out.println("Dime que posicion quireres saber:");
                    int nump = sc.nextInt();
                    System.out.println(c[nump]);
                    System.exit(0);

                break;

                case 23:

                    System.out.println("Dime de que tamanyo quieres el array:");
                    int tamanyo5 = sc.nextInt();
                    int[] d = new int[tamanyo5];
                    for (int j = 0; j < tamanyo5; j++) {
                        System.out.println("Dime el caracter " + j + " del array:");

                        d[j] = sc.nextInt();
                    }

                    System.out.println(Arrays.toString(FNumDaw.volteaArrayInt(d)));
                    System.exit(0);

                break;
            }
        }
    }
}
