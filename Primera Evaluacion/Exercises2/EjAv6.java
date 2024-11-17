public class EjAv6
{
    public static void main(String[] args)
    {
        String nombre = "Carlos Luz Garcia";
        String nombre1;
        String apellido1;
        String apellido2;

        int primer_espacio = nombre.indexOf(" ");
        int segundo_espacio = nombre.indexOf(" ", primer_espacio+1);
        
        nombre1 = nombre.substring(0, primer_espacio);
        apellido1 = nombre.substring(primer_espacio+1, segundo_espacio);
        apellido2 = nombre.substring(segundo_espacio);

        System.out.println("Nombre: " + nombre1 + " Primer apellido: " + apellido1 + " Segundo apellido: " + apellido2);

        String cadena1 = "Carlos Luz Garcia";
        String cadena2 = "Carlos";
        String cadena3 = "Luz";
        String cadena4 = "Garcia";

        System.out.println("longitud de la cadena: " + cadena1.length());
        System.out.println("longitud del nombre: " + cadena2.length());
        System.out.println("longitud del primer apellido: " + cadena3.length());
        System.out.println("longitud del segundo apellido: " + cadena4.length());

    }
}
