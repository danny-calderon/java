import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class EDQueue {
    public static void main(String[] args) {

        // Creamos Queue
        Queue<String> diasSemana = new LinkedList<String>();
        Queue<Integer> numeros = new LinkedList<Integer>();
        
        String dia;
        Integer numero;
        
        // Añadimos elementos a Queue
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sabado");
        diasSemana.add("Domingo");
        for (int i = 1; i <= 10; i++) {
        numeros.add(i);
        }

        // Iteramos la estructura con Iterator
        System.out.println("Iteramos con Iterator");
        Iterator<String> itq = diasSemana.iterator();
        while (itq.hasNext()) {
            System.out.println(itq.next());
        }

        System.out.println("Iteramos con Foreach");
        //Iteramos con foreach
        for (Integer num : numeros) {
            System.out.println(num);
        }

        // Obtenemos el primer elemento
        dia = diasSemana.peek();
        numero = numeros.peek();
        System.out.printf("El primer día de la semana es el %s\n", dia);
        System.out.printf("El primer número de la cola es el %s\n", numero);

        // Desencolamos los elementos uno a uno hasta dejar la cola vacía
        System.out.println("Desencolamos los elementos");
        while (dia!=null) {
            System.out.printf("Elimina el elemento %s de la cola\n", dia);
            diasSemana.poll();
            System.out.printf("La cola es: %s\n", diasSemana);
            dia = diasSemana.peek();
        }
        while (numero!=null) {
            System.out.printf("Se elimina el elemento %d\n", numero);
            numeros.poll();
            System.out.printf("La cola es: %s\n", numeros.toString());
            numero = numeros.peek();
        }
    }
}