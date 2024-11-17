public class Estudiante extends Persona {
    private int idEstudiante;

    // Constructor predeterminado
    public Estudiante() {
    }

    // Constructor parametrizado
    public Estudiante(String nombre, String apellidos, String nif, Direccion direccion, int idEstudiante) {
        super(nombre, apellidos, nif, direccion);
        this.idEstudiante = idEstudiante;
    }

    // Métodos getters y setters
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return super.toString() + " - ID Estudiante: " + idEstudiante;
    }
}
