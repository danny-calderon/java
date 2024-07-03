import java.time.LocalTime;

public class Tiempo implements Comparable<Tiempo> {

    // Inicializamos las variables
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo(int hora, int minutos, int segundos) {
        // Validamos los parámetros para asegurarnos de que son valores válidos
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("Hora no válida");
        }
        if (minutos < 0 || minutos >= 60) {
            throw new IllegalArgumentException("Minutos no válidos");
        }
        if (segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Segundos no válidos");
        }
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Este es el único que vamos a mostrar
    @Override
    public String toString() {
        return this.hora + "h " + this.minutos + "m " + this.segundos + "s ";
    }

    public void sumar(Tiempo tiempo2) {
        LocalTime temp1 = LocalTime.of(hora, minutos, segundos);
        LocalTime temp2 = LocalTime.of(tiempo2.hora, tiempo2.minutos, tiempo2.segundos);

        // Sumar las dos horas de LocalTime
        LocalTime resultado = temp1.plusHours(temp2.getHour())
                                   .plusMinutes(temp2.getMinute())
                                   .plusSeconds(temp2.getSecond());

        this.hora = resultado.getHour();
        this.minutos = resultado.getMinute();
        this.segundos = resultado.getSecond();
    }

    public void restar(Tiempo tiempo2) {
        LocalTime temp1 = LocalTime.of(hora, minutos, segundos);
        LocalTime temp2 = LocalTime.of(tiempo2.hora, tiempo2.minutos, tiempo2.segundos);

        // Restar las dos horas de LocalTime
        LocalTime resultado = temp1.minusHours(temp2.getHour())
                                   .minusMinutes(temp2.getMinute())
                                   .minusSeconds(temp2.getSecond());

        this.hora = resultado.getHour();
        this.minutos = resultado.getMinute();
        this.segundos = resultado.getSecond();
    }

    @Override
    public int compareTo(Tiempo tiempo2) {
        LocalTime temp1 = LocalTime.of(hora, minutos, segundos);
        LocalTime temp2 = LocalTime.of(tiempo2.hora, tiempo2.minutos, tiempo2.segundos);

        // Comparar las dos horas de LocalTime
        return temp1.compareTo(temp2);
    }

    public static void main(String[] args) {
        // Crear algunas instancias de Tiempo
        Tiempo t1 = new Tiempo(12, 30, 45);
        Tiempo t2 = new Tiempo(2, 45, 15);
        Tiempo t3 = new Tiempo(14, 15, 30);

        // Mostrar los tiempos originales
        System.out.println("Tiempo 1: " + t1);
        System.out.println("Tiempo 2: " + t2);
        System.out.println("Tiempo 3: " + t3);

        // Sumar t2 a t1
        t1.sumar(t2);
        System.out.println("Tiempo 1 después de sumar Tiempo 2: " + t1);

        // Restar t3 de t1
        t1.restar(t3);
        System.out.println("Tiempo 1 después de restar Tiempo 3: " + t1);

        // Comparar tiempos
        int comparacion = t1.compareTo(t2);
        if (comparacion > 0) {
            System.out.println("Tiempo 1 es mayor que Tiempo 2");
        } else if (comparacion < 0) {
            System.out.println("Tiempo 1 es menor que Tiempo 2");
        } else {
            System.out.println("Tiempo 1 es igual a Tiempo 2");
        }
    }
}
