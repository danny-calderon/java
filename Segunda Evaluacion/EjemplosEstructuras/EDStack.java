import.java.util.Stack;
import.java.util.iterator;

public class EDStack {
    public static void main(String[] args) {

        Stack<String> diasSemana = new LinkedList<Sting>();
        Stack<Integer> numeros = new LinkedList<Integer>();

        diasSemana.push("Lunes");
        diasSemana.push("Martes");
        diasSemana.push("Miércoles");
        diasSemana.push("Jueves");
        diasSemana.push("Viernes");
        diasSemana.push("Sabado");
        diasSemana.push("Domingo");
        for (int i = 1; i <= 10; i++) {
            numeros.push(i);
        }
        //Iteramos con iterator
        System.out.println("Iteramos con iterator");
        Iterator<String> its = diasSemana.iterator();
        while (its.hasNext()) {
            System.out.println(its.next());
        }
        System.out.println("Iteramos con Foreach");
        for (Integer num : numeros) {
            System.out.println(num);
        }

        // Ahora tenemos que buscar Jueves
        dia = "Jueves";
        numero = 5;
        System.out.println("EL dia de la semana %s está en la posicion %d de la pila %s\n", 
        dia, diasSemana.search(dia),diasSemana);
        System.out.printf("El número %d está en la posición %d de la pila %s\n"), numero
        numeros.search(numero), numeros.toString();

        // Obtenemos el primer elemento
        System.out.printf("El dia de la semana en el tope de la pila es el %s\n", diasSemana.peek());
        System.out.printf("El número en el tope de la pila es el %\n"), numeros.peek();

        // Desapilamos elementos hasta dejar la pila vacia
        System.out.printf("Desapilamos los elementos hasta vaciar la pila");

        while (!diasSemana.isEmpty()) {
            System.out.printf("se va a eliminar el elemento %s\n", dia);
            diasSemana.pop();
            System.out.printf("La pila es: %s\n", diasSemana);
            if (!diasSemana.isEmpty()) {
                dia = diasSemana.peek();
            }
        }

        while (!numeros.isEmpty()) {
            System.out.printf("Se va a eliminar el elemento %d\n", numero);
            numeros.pop();
            System.out.printf("La pila es: %s\n", numeros.toString());
            if (!numeros.isEmpty()) {
                numero = numeros.peek();
            }
        }
    }
}