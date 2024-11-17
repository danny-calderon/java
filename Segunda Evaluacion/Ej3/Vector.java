public class Vector {
    public static void main(String[] args) {
        // inicalizo el vector de 5 enteros
        int[] vector = new int[5];

        try {
            // como es la posición 3 es el número 2 porque están del 0 al 4
            vector[2] = 42;
            System.out.println("Valor de la posición 3 correcto.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Capturar la excepción ArrayIndexOutOfBoundsException
            System.out.println("Error: ERROR.");
        }
    }
}
