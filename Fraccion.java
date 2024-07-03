/*
 * Crea la clase Fraccion. Los atributos serán numerador y denominador. El método Constructor creará la fracción 1/1.
 *   Implementa los métodos:
 *   • invertir
 *   • simplificar • multiplicar • dividir
 *   Realizar un programa para probar todas las funcionalidades de la clase Fracción
*/

public class Fraccion {

    private int numerador;
    private int denominador;
    private float resultado;

    // Método para invertir la fracción
    public void invertir() {
        int temp = numerador;
        numerador = denominador;
        denominador = temp;
    }

    // Método para obtener la fracción invertida como una cadena
    public String obtenerInversa() {
        return denominador + "/" + numerador;
    }

    // Método para multiplicar dos fracciones
    public void multiplicar(int numerador, int denominador) {
        this.resultado = (float) this.numerador * numerador / (this.denominador * denominador);
    }

    // Método para dividir dos fracciones
    public void dividir(int numerador, int denominador) {
        this.resultado = (float) this.numerador * denominador / (this.denominador * numerador);
    }

    // Método para encontrar el Máximo Común Divisor (MCD)
    private int encontrarMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Método para simplificar la fracción
    public void simplificar() {
        int mcd = encontrarMCD(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    // Getters y Setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public float getResultado() {
        return resultado;
    }

    public static void main(String[] args) {
        // Crear una fracción
        Fraccion fraccion = new Fraccion();
        fraccion.setNumerador(4);
        fraccion.setDenominador(8);
        System.out.println("Fracción original: " + fraccion.getNumerador() + "/" + fraccion.getDenominador());

        // Simplificar la fracción
        fraccion.simplificar();
        System.out.println("Fracción simplificada: " + fraccion.getNumerador() + "/" + fraccion.getDenominador());

        // Invertir la fracción
        fraccion.invertir();
        System.out.println("Fracción invertida: " + fraccion.obtenerInversa());

        // Multiplicar fracciones
        fraccion.multiplicar(3, 4); // Multiplicar por 3/4
        System.out.println("Resultado de la multiplicación: " + fraccion.getResultado());

        // Dividir fracciones
        fraccion.dividir(3, 4); // Dividir por 3/4
        System.out.println("Resultado de la división: " + fraccion.getResultado());
    }
}
