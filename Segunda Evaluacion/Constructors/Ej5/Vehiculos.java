public class Vehiculos {
    public static int vehiculosCreados = 0;
    public static int kilometrosTotales = 0;

    int kilometrosRecorridos;

    public Vehiculos() {
        Vehiculos.vehiculosCreados++;
        this.kilometrosRecorridos = 0;
    }

    public void andar(int distancia) {
        this.kilometrosRecorridos += distancia;
        Vehiculos.kilometrosTotales += distancia;
    }

    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }
    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }
}