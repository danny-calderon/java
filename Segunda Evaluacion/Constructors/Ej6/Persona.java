public class Profesor extends Persona {
    private String numDespacho;

    // Constructor predeterminado
    public Profesor() {
    }

    // Constructor parametrizado
    public Profesor(String nombre, String apellidos, String nif, Direccion direccion, String numDespacho) {
        super(nombre, apellidos, nif, direccion);
        this.numDespacho = numDespacho;
    }

    // Métodos getters y setters
    public String getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(String numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + " - Despacho: " + numDespacho;
    }
}
