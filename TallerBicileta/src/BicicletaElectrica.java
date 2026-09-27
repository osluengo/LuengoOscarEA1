public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {

   private int autonomia;
   private boolean bateriaCertificada;
   private boolean garantiaExtendida;

    public BicicletaElectrica(String codigoBicicleta, int anoFabrica, double peso, int autonomia, boolean bateriaCertificada, boolean garantiaExtendida) {
        super(codigoBicicleta, anoFabrica, peso);
        this.autonomia = autonomia;
        this.bateriaCertificada = bateriaCertificada;
        this.garantiaExtendida = garantiaExtendida;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        if (autonomia <=0){
            throw new IllegalArgumentException("Autonomia debe ser mayor que 0");
        }
        this.autonomia = autonomia;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean isGarantiaExtendida() {
        return garantiaExtendida;
    }

    public void setGarantiaExtendida(boolean garantiaExtendida) {
        this.garantiaExtendida = garantiaExtendida;
    }

    @Override
    public double calcularCostoMantencion() {
        double costoBase = 45000;
        if (!bateriaCertificada){
            costoBase *= 1.25;
        }
        return 0;
    }

    @Override
    public void add(Bicicleta bicicletas) {

    }

    @Override
    public boolean tieneGarantiaExtendidaActiva() {
        return false;
    }

    @Override
    public void activarGarantiaExtendida() {

    }
}
