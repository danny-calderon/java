class Devolucion extends Formulario {
    String producto;
    double precio;

    public Devolucion(String cliente, String idDevolucion, String producto, double precio) {
        super(cliente, idDevolucion);
        this.producto = producto;
        this.precio = precio;
    }

    @Override
    String obtenerDatos() {
        return "ID: " + idFormulario + "\nCliente: " + cliente + "\nProducto: " + producto + "\nPrecio: " + precio;
    }
}