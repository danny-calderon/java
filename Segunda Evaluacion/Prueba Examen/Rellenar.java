// Aquí he buscado mucho por Internet porque a mi manera no había forma de que saliera
// he cambiado unas cuantas cosas y he comentado las líneas para que veas que lo he entendido.

import java.util.ArrayList;

class Rellenar {
    private ArrayList<Formulario> formularios = new ArrayList<>();

    public Rellenar() {
    }

    // método para crear un formulario y añadirlo a la
    private void crearFormulario(String tipo, String cliente, String producto, double precio, String textoReclamacion) {
        // basándome en el tipo, genero un ID para el formulario y la cantidad de formularios de ese tipo que ya existen
        String idFormulario = tipo + (formularios.stream().filter(f -> f.getClass().getSimpleName().equals(tipo)).count() + 1);

        Formulario formulario;

        // según el tipo crea el formulario adecuado
        switch (tipo) {
            case "PE":
                formulario = new Pedido(cliente, idFormulario, producto, precio);
                break;
            case "DE":
                formulario = new Devolucion(cliente, idFormulario, producto, precio);
                break;
            case "RE":
                formulario = new Reclamacion(cliente, idFormulario, textoReclamacion);
                break;
            default: // si escribimos otra cosa dará error por lo tanto imprimirá este mensaje.
                throw new IllegalArgumentException("Tipo de formulario no válido");
        }

        // lo añadimos a la lista
        formularios.add(formulario);
        // imprimo el mensaje de confirmación
        System.out.println(formulario.getClass().getSimpleName() + " creado con ID: " + idFormulario);
    }

    //==============================================================================================
    //ESTOS 3 MÉTODOS SON LO MISMO PERO SOLO CAMBIANDO EL TIPO, PARA GENERAR CADA TIPO DE FORMULARIO
    //==============================================================================================
    void crearPedido(String cliente, String producto, double precio) {
        crearFormulario("PE", cliente, producto, precio, null);
    }

    void crearDevolucion(String cliente, String producto, double precio) {
        crearFormulario("DE", cliente, producto, precio, null);
    }

    void crearReclamacion(String cliente, String textoReclamacion) {
        crearFormulario("RE", cliente, null, 0, textoReclamacion);
    }

    // cerrar una reclamación
    void cerrarReclamacion(String idReclamacion) {
        // busco la reclamación con el id y si la encuentro la cierro
        Formulario formulario = formularios.stream()
                .filter(f -> f.getClass().getSimpleName().equals("Reclamacion") && f.idFormulario.equals(idReclamacion))
                .findFirst().orElse(null);

        if (formulario != null) {
            ((Reclamacion) formulario).cerrarReclamacion();
            System.out.println("Reclamación cerrada, ID: " + idReclamacion);
        } else {
            System.out.println("No se ha encontrado la reclamación con ese ID.");
        }
    }

    // imprimimos datos del formulario según 
    void imprimirFormularioPorId(String idFormulario) {
        // buscamos el ID y si lo encontramos lo imprimimos
        formularios.stream()
                .filter(f -> f.idFormulario.equals(idFormulario))
                .findFirst()
                .ifPresentOrElse(
                        formulario -> System.out.println(formulario.obtenerDatos()),
                        () -> System.out.println("No se ha encontrado el formulario con ese ID.")
                );
    }
    void imprimirTodasLasReclamaciones() {
        // imprimimos todos los datos de las reclamaciones
        formularios.stream()
                .filter(f -> f instanceof Reclamacion)
                .forEach(formulario -> System.out.println(formulario.obtenerDatos()));
    }
    void imprimirTodosLosFormularios() {
        // lo mismo que arriba pero de todos los formularios
        formularios.forEach(formulario -> System.out.println(formulario.obtenerDatos()));
    }
}