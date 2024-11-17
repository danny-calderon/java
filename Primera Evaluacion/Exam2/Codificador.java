import java.util.Scanner;

public class Codificador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        String[] imagen = new String[filas]; //lleno un array llamado imagen con el número que pido antes, que se llama filas
        System.out.println("Ingrese las filas de la imagen (solo '1' y '0'):");
        for (int i = 0; i < filas; i++) { //recorro el array y le digo que haga un string llamado fila del número que yo pida por teclado
            String fila = scanner.next();
            imagen[i] = fila; //lleno el array de antes con el string de los numeros que yo digo por teclado
        }

        for (String fila : imagen) {
            String codificacion = codificarFila(fila); //uso el método de abajo para pintar la cantidad de números que hay en cada fila
            System.out.println(codificacion);
        }
    }

    private static String codificarFila(String fila) { //este public static codifica la fila 
        StringBuilder resultado = new StringBuilder();
        int count = 1;

        for (int i = 1; i < fila.length(); i++) { //recorro el string fila de los numeros que he puesto por teclado
            if (fila.charAt(i) == fila.charAt(i - 1)) { //separo cada caracter de la fila
                count++;
            } else {
                resultado.append(count).append(" ");
                count = 1;
            }
        }

        resultado.append(count); //aquí devuelve la cantidad de 1 y 0 que hay en la fila

        return resultado.toString();
    }
}
