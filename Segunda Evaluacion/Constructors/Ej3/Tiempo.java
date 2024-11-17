public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo (int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String toString() {
        String resultado = this.horas + "h " + this.minutos + "m " + this.segundos + "s ";
        return resultado;
    }    
    public void suma(Tiempo tiempo2) {
        int sr = tiempo2.getSegundos() + this.segundos;
        int mr = tiempo2.getMinutos() + this.minutos;
        int hr = tiempo2.getHoras() + this.horas;
    
        if (sr > 59) {
            int min = sr / 60;
            mr += min;
            sr %= 60; 
        }
        if (mr > 59) {
            int hora = mr / 60;
            hr += hora;
            mr %= 60; 
        }
    
        this.horas = hr;
        this.minutos = mr;
        this.segundos = sr;
    }
    
    public String resta(Tiempo tiempo2) {

        int sr = this.segundos - tiempo2.getSegundos();
        int mr = this.minutos - tiempo2.getMinutos();
        int hr = this.horas - tiempo2.getHoras();

        String temp = hr + "h " + mr + "m " + sr + "s";

        if (sr < 0) {
            mr -= 1;
            sr += 60;
        }

        if (mr < 0) {
            hr -= 1;
            mr += 60;
        }if (hr < 0) {
            return "0s";
        }

        return temp;
    }
    public int compareTo(Tiempo tiempo2) { //un poco guarro pero sale bien
        if (this.horas > tiempo2.getHoras()) {
            return 1;
        } else if (this.horas < tiempo2.getHoras()) {
            return -1;
        } else {
            if (this.minutos > tiempo2.getMinutos()) {
                return 1;
            } else if (this.minutos < tiempo2.getMinutos()) {
                return -1;
            } else {
                if (this.segundos > tiempo2.getSegundos()) {
                    return 1;
                } else if (this.segundos < tiempo2.getSegundos()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}