public class EjAv5
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
    }
}
