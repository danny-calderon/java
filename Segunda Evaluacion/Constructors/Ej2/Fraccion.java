public class Fraccion {

    private int numerador;
    private int denominador;

    public void fraccion() {
        this.numerador = 1;
        this.denominador = 1;
    }
    //getters and setters
    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public int setNumerador() {
        return numerador;
    }
    public int setDenominador() {
        return denominador;
    }
    //getters and setters
    public void fraccion(int num, int denom) {
        this.numerador = num;
        this.denominador = denom;
    }
    public void invertir() {
        int temp;
        temp = numerador;
        this.numerador = denominador;
        this.denominador = temp;
    }
    public int mcd(int num, int denom) {
        while (denom != 0) {
            int temp2 = denom;
            denom = num % denom;
            num = temp2;
        }
        return num;
    }
    public void simplificar(int num, int denom) {
        int a = mcd(num, denom);
        this.numerador = num / a;
        this.denominador = denom /a;
    }
    public void multiplicar(Fraccion fraccion) {
        this.numerador = numerador * fraccion.getNumerador();
        this.denominador = denominador * fraccion.getDenominador();
    }
    public void dividir(Fraccion fraccion) {
        this.numerador = numerador / fraccion.getNumerador();
        this.denominador = denominador / fraccion.getDenominador();
    }
    public void multiplicar(int numerador2, int denominador2, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiplicar'");
    }
    public void dividir(int numerador2, int denominador2, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dividir'");
    }
}