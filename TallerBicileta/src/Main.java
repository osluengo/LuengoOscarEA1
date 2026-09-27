public class Main {
    public static void main(String[] args) {
        // 1. Instanciar bicicletas según datos de la tabla
        BicicletaElectrica e1 = new BicicletaElectrica("BIC-E01",2023, 22.5, 60, false, false);
        BicicletaElectrica e2 = new BicicletaElectrica("BIC-E02", 2022, 24.0, 45, true, false);
        BicicletaMontana m1 = new BicicletaMontana("BIC-M01", 2021, 13.5, 2);
        BicicletaMontana m2 = new BicicletaMontana("BIC-M02", 2020, 12.0, 1);

        // 2. Marcar BIC-E01 con garantía extendida
        e1.activarGarantiaExtendida();

        // 3. Registrar bicicletas en el gestor
        GestorBicicleta gestor = new GestorBicicleta();
        gestor.registrarBicicleta(e1);
        gestor.registrarBicicleta(e2);
        gestor.registrarBicicleta(m1);
        gestor.registrarBicicleta(m2);

        System.out.println();

        // 4. Búsqueda por código e impresión detallada
        String codigoBusqueda = "BIC-E01";
        System.out.println("=== BUSQUEDA POR CODIGO: \"" + codigoBusqueda + "\" ===");
        Bicicleta encontrada = gestor.buscarBicicletaCodigo(codigoBusqueda);

        if (encontrada != null) {
            if (encontrada instanceof BicicletaElectrica) {
                BicicletaElectrica elec = (BicicletaElectrica) encontrada;
                System.out.println("Tipo: Bicicleta Eléctrica | Código: " + elec.getCodigoBicicleta() +
                        " | Año: " + elec.getAnoFabrica() +
                        " | Peso: " + elec.getPeso() + " kg" +
                        " | Autonomía: " + elec.getAutonomia() + " km" +
                        " | Batería certificada: " + (elec.isBateriaCertificada() ? "Si" : "No") +
                        "\n  Garantia extendida: " + (elec.tieneGarantiaExtendidaActiva() ? "Si" : "No") +
                        " | Costo mantención: $" + (int) elec.calcularCostoMantencion());
            } else if (encontrada instanceof BicicletaMontana) {
                BicicletaMontana mon = (BicicletaMontana) encontrada;
                System.out.println("Tipo: Bicicleta de Montaña | Código: " + mon.getCodigoBicicleta() +
                        " | Año: " + mon.getAnoFabrica() +
                        " | Peso: " + mon.getPeso() + " kg" +
                        " | Suspensiones: " + mon.getCantidadSuspensiones() +
                        " | Costo mantención: $" + (int) mon.calcularCostoMantencion());
            }
        } else {
            System.out.println("Bicicleta no encontrada.");
        }

        System.out.println("---\n");

        // 5. Listado general invocando el método toString() de cada objeto
        System.out.println("=== LISTADO DE BICICLETAS ===");
        for (Bicicleta b : gestor.getBicicletas()) {
            System.out.println(b.toString());
        }
    }
}