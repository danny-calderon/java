class Reclamacion extends Formulario {
    String textoReclamacion;
    String estado;

    public Reclamacion(String cliente, String idReclamacion, String textoReclamacion) {
        super(cliente, idReclamacion);
        this.textoReclamacion = textoReclamacion;
        this.estado = "Abierta";
    }

    void cerrarReclamacion() {
        estado = "Cerrada";
    }

    @Override
    String obtenerDatos() {
        return "ID: " + idFormulario + "\nCliente: " + cliente + "\nTexto de la reclamación: " + textoReclamacion + "\nEstado: " + estado;
    }
}