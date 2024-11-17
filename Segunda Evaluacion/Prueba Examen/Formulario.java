abstract class Formulario {
    String cliente;
    String idFormulario;

    public Formulario(String cliente, String idFormulario) {
        this.cliente = cliente;
        this.idFormulario = idFormulario;
    }

    abstract String obtenerDatos();
}