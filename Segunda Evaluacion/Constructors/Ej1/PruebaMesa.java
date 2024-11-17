import lib.Mesa;

public class PruebaMesa {
    public static void main(String[] args) {

        Mesa miMesa = new Mesa();

        System.out.println(miMesa.getColor());

        miMesa.setColor("Amarillo");
        System.out.println("Nuevo color: " + miMesa.getColor());
        System.out.println("Area: " + miMesa.area());
        System.out.println("---");

        Mesa otraMesa = new Mesa("Azul", 3, 50, 60, "Acero");
        System.out.println("Otro color: " + otraMesa.getColor());
        System.out.println("Otro area: " + otraMesa.area());
        System.out.println("Otro area m: " + otraMesa.area("m"));
        System.out.println("Otro area in: " + otraMesa.area("in"));
        System.out.println("Otro area x: " + otraMesa.area("x"));
    }
}