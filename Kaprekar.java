
import java.lang.reflect.Array;
import java.util.Scanner;

public class Kaprekar{

    public static int[] separar (int n2 ){

           /*
            * Convertir en String para poder separar por caracteres
            */

            String numero = String.valueOf(n2);

            /*
            * separamos la mitad del numero 
            */
            int mid = numero.length() / 2 ; 

            /*
            * Sacamos la primer y segunda parte
            */
            String parte1 = numero.substring(0, mid);
            String parte2 = numero.substring(mid);

            /*
            * Lo convertimos en números
            * Aseguramos que las partes vacías sean tratadas como 0
            */
            int numero1 = parte1.isEmpty() ? 0 : Integer.parseInt(parte1);
            int numero2 = parte2.isEmpty() ? 0 : Integer.parseInt(parte2);

        return new int[]{numero1, numero2};
    }

    public static boolean  kaprekar (int n) {

            /*
            * sacamos el numero elevado 
            */
            int n2 = n * n;

            /*
            * sumamos las dos partees de numero 
            */
            int[] partes = separar(n2);
            int resultado = partes[0] + partes[1];

            return resultado == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la cantida de numeros que quieres mirar si son kaprekar: ");
        int cantidad = sc.nextInt();

        /*
         * Declaramos un array 
         */
        int [] array = new int[cantidad];

        System.out.println("Dime un numero: ");

        for (int i = 0; i < cantidad ;i++){
            
            array[i] = sc.nextInt();
        }
            
            for (int num : array)

                if (kaprekar(num)){

                    System.out.println("el numero " + num+ " es kaprekar");

                }else {

                    System.out.println("el numero " + num + " no es kaprekar");  

                }
        
    }
}

 