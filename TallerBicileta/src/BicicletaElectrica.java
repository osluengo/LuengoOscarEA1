public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {
    private int autonomia;
    private boolean bateriaCertificada;
    private boolean garantiaExtendidaActiva;

    public BicicletaElectrica(String codigo, int anioFabricacion, double peso, int autonomia, boolean bateriaCertificada) {
        super(codigo, anioFabricacion, peso);
        setAutonomia(autonomia);
        setBateriaCertificada(bateriaCertificada);
        this.garantiaExtendidaActiva = false;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        if (autonomia <= 0) {
            throw new IllegalArgumentException("La autonomía debe ser mayor a cero.");
        }
        this.autonomia = autonomia;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    @Override
    public boolean tieneGarantiaExtendidaActiva() {
        return this.garantiaExtendidaActiva;
    }

    @Override
    public void activarGarantiaExtendida() {
        this.garantiaExtendidaActiva = true;
    }

    @Override
    public double calcularCostoMantencion() {
        double costoBase = 45000.0;
        if (!bateriaCertificada) {
            costoBase *= 1.25; // Incremento del 25%
        }
        return costoBase;
    }

    @Override
    public void add(Bicicleta bicicletas) {

    }
}