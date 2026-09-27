public class BicicletaMontana extends Bicicleta{

    private int cantidadSuspensiones;

    public BicicletaMontana(String codigoBicicleta, int anoFabrica, double peso, int cantidadSuspensiones) {
        super(codigoBicicleta, anoFabrica, peso);
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        if (cantidadSuspensiones < 0){
            throw new IllegalArgumentException("El cantidad de suspensiones debe ser mayor a 0");
        }
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    @Override
    public double calcularCostoMantencion() {
        double costoBase = 30000;
        if(cantidadSuspensiones > 1){
            costoBase *= 1.15;;
        }
        return 0;
    }

    @Override
    public void add(Bicicleta bicicletas) {

    }
}
