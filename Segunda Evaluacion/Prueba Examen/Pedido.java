class Pedido extends Formulario {
    String producto;
    double precio;

    public Pedido(String cliente, String idPedido, String producto, double precio) {
        super(cliente, idPedido);
        this.producto = producto;
        this.precio = precio;
    }

    @Override
    String obtenerDatos() {
        return "ID: " + idFormulario + "\nCliente: " + cliente + "\nProducto: " + producto + "\nPrecio: " + precio;
    }
}