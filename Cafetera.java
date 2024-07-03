
/*
 * Desarrolla una clase Cafetera con atributos capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera).
 * Implementa, al menos, los siguientes métodos:
 * 
 *  Constructor predeterminado: establece la capacidad máxima en 1000 (ml) y la actual en cero(cafetera vacía).
 *  Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de café igual a la capacidad máxima.
 *  Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es mayor que lacapacidad máxima de la cafetera, la ajustará al máximo.
 *  Getters y Setters.
 *  llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.
 *  servirTaza(int): simula la acción de servir una taza con la capacidad indicada.Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
 *  vaciarCafetera(): pone la cantidad de café actual en cero.
 *  agregarCafe(int): añade a la cafetera la cantidad de café indicada.
 */

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    // Constructor predeterminado
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    // Constructor con la capacidad máxima
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    // Constructor con capacidad máxima y cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    // Getters y Setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    // Método para llenar la cafetera
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    // Método para servir una taza
    public void servirTaza(int capacidadTaza) {
        if (cantidadActual >= capacidadTaza) {
            cantidadActual -= capacidadTaza;
        } else {
            cantidadActual = 0; // Sirve lo que queda
        }
    }

    // Método para vaciar la cafetera
    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    // Método para agregar café a la cafetera
    public void agregarCafe(int cantidad) {
        if (cantidadActual + cantidad > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        } else {
            cantidadActual += cantidad;
        }
    }

    /*
     * Esto es la prueba de la cafetera
     */
    
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();

        // Ejemplos de uso de los métodos de la clase
        cafetera.llenarCafetera();
        System.out.println("Cantidad actual después de llenar: " + cafetera.getCantidadActual());

        cafetera.servirTaza(400);
        System.out.println("Cantidad actual después de servir una taza de 400ml: " + cafetera.getCantidadActual());

        cafetera.agregarCafe(300);
        System.out.println("Cantidad actual después de agregar 300ml de café: " + cafetera.getCantidadActual());

        cafetera.vaciarCafetera();
        System.out.println("Cantidad actual después de vaciar la cafetera: " + cafetera.getCantidadActual());
    }
}
