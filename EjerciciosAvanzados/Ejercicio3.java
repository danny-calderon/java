// Pau gra <3
public class Ejercicio3 {
    public static void main(String[] args) {
        double a= 1;
        double b= -5;
        double c=4;
        double x1;
        double x2;

        x1=(-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
        x2=(-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);

        System.out.printf("Elresultado de la ecuacion positiva es : %.1f. Mientras que la negativa es: %.1f",x1, x2);
        System.out.println();
    }
}
