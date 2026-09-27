public abstract class Bicicleta {

    private String codigoBicicleta;
    private int anoFabrica;
    private double peso;

    public Bicicleta(String codigoBicicleta, int anoFabrica, double peso) {
        this.codigoBicicleta = codigoBicicleta;
        this.anoFabrica = anoFabrica;
        this.peso = peso;
    }

    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public void setCodigoBicicleta(String codigoBicicleta) {
        if (codigoBicicleta == null || codigoBicicleta.trim().isEmpty()){
            throw new IllegalArgumentException("El cdogio no puede ser nulo ni vacio");
        }
        this.codigoBicicleta = codigoBicicleta;
    }

    public int getAnoFabrica() {
        return anoFabrica;
    }

    public void setAnoFabrica(int anoFabrica) {
        if (anoFabrica < 2000 || anoFabrica > 2026){
            throw new IllegalArgumentException("El ano de fabrica debe estar entre 2000 e 2026");
        }
        this.anoFabrica = anoFabrica;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso<=0){
            throw new IllegalArgumentException("El peso debe ser mayor que 0");
        }
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "codigoBicicleta='" + codigoBicicleta + '\'' +
                ", anoFabrica=" + anoFabrica +
                ", peso=" + peso +
                '}';
    }

    public abstract double calcularCostoMantencion();

    public abstract void add(Bicicleta bicicletas);
}
