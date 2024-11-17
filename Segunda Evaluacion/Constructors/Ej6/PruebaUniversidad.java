public class Main {
    public static void main(String[] args) {

        Persona Carlos = new Persona("Carlos", "Luz", "26660338A", "calle daw", "valencia", 46470, "Espana");
        Estudiante Gines = new Estudiante("Gines", "Garcia", "26660335R", new Direccion("Calle daw", "Paiporta", 56465, "Espania"));
        Profesor Tatay = new Profesor("Vicent", "Tatay", "45553661F", new Direccion("calle dam", "Madrid", 45458, "Francia"));
        
        System.out.println(Carlos);
        System.out.println(Gines);
        System.out.println(Tatay);
        Gines.setIdEstudiante(35);
        System.out.println(Gines);
        Tatay.setndespacho(4);
        System.out.println(Tatay);
    }
}