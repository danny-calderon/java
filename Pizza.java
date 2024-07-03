/*
*Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza se necesita saber el tamaño - mediana o *familiar - el tipo - margarita, cuatro quesos o funghi - y su estado - pedida o servida. La clase debe almacenar información *sobre el número total de pizzas que se han pedido y que se han servido. Siempre que se crea una pizza nueva, su estado es“pedida”. Desarrolla el método toString para obtener la salida de texto deseada al invocar al objeto desde, por ejemplo, *System.out.print.
*/

public class Pizza {

    // Declaramos las variables
    private String estado;
    private String tamaño;
    private String tipo;

    // Variables estáticas para contar las pizzas pedidas y servidas
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    // Constructor de la clase Pizza
    public Pizza(String tipo, String tamaño) {
        // Validamos el tamaño
        if (tamaño.equals("mediana") || tamaño.equals("familiar")) {
            this.tamaño = tamaño;
        } else {
            throw new IllegalArgumentException("Tamaño no válido. Debe ser 'mediana' o 'familiar'.");
        }

        // Validamos el tipo
        if (tipo.equals("margarita") || tipo.equals("cuatro quesos") || tipo.equals("funghi")) {
            this.tipo = tipo;
        } else {
            throw new IllegalArgumentException("Tipo no válido. Debe ser 'margarita', 'cuatro quesos' o 'funghi'.");
        }

        // Inicializamos el estado y aumentamos el contador de pizzas pedidas
        this.estado = "Pedida";
        totalPedidas++;
    }

    // Método para servir la pizza
    public void sirve() {
        if (this.estado.equals("Pedida")) {
            this.estado = "Servida";
            totalServidas++;
        } else {
            System.out.println("Esa pizza ya se ha servido");
        }
    }

    // Método estático para obtener el total de pizzas pedidas
    public static int getTotalPedidas() {
        return totalPedidas;
    }

    // Método estático para obtener el total de pizzas servidas
    public static int getTotalServidas() {
        return totalServidas;
    }

    // Método para representar la pizza como cadena
    @Override
    public String toString() {
        return "Pizza " + tipo + " " + tamaño + ", " + estado;
    }

    // Método principal para pruebas
    public static void main(String[] args) {
        // Crear algunas pizzas
        Pizza pizza1 = new Pizza("margarita", "mediana");
        Pizza pizza2 = new Pizza("cuatro quesos", "familiar");
        Pizza pizza3 = new Pizza("funghi", "mediana");

        // Mostrar las pizzas pedidas
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        // Servir algunas pizzas
        pizza1.sirve();
        pizza2.sirve();

        // Intentar servir una pizza ya servida
        pizza1.sirve();

        // Mostrar el estado de las pizzas después de servir
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        // Mostrar los totales de pizzas pedidas y servidas
        System.out.println("Total de pizzas pedidas: " + Pizza.getTotalPedidas());
        System.out.println("Total de pizzas servidas: " + Pizza.getTotalServidas());
    }
}
