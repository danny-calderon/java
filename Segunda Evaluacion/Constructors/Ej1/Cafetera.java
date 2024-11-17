public class Cafetera{
    private int cantidadActual;

    public Cafetera(){
        this.cantidadActual = 0;
    }

    public Cafetera(int cantmax){
        this.cantidadActual = cantmax;
    }

    public Cafetera(int cantmax, int cantact){
        this.cantidadActual = cantact;
        if(cantact > cantmax){
            this.cantidadActual = cantmax;
        }
    }
    public void setCantact(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int llenarCafetera(int cantidadMaxima, int a_cantact){
        a_cantact = cantidadMaxima;
        return a_cantact;
    }

    public int servirTaza(int cantidadMaxima, int a_cantact){
        if(cantidadMaxima > cantidadActual){
            cantidadMaxima = cantidadActual;
        }

        return cantidadMaxima;
    }

    public int vaciarCafetera(int a_cantact){
        a_cantact = 0;
        return a_cantact;
    }

    public int agregarCafe(int cant, int a_cantact){
        a_cantact = a_cantact + cant;
        return a_cantact;
    }
}