public class Main {
    public static void main(String[] args) {
        try {
            // 1. Instanciar bicicletas segun la tabla de requerimientos
            BicicletaElectrica e1 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60, false);
            BicicletaElectrica e2 = new BicicletaElectrica("BIC-E02", 2022, 24.0, 45, true);
            BicicletaMontanya m1 = new BicicletaMontanya("BIC-M01", 2021, 13.5, 2);
            BicicletaMontanya m2 = new BicicletaMontanya("BIC-M02", 2020, 12.0, 1);

            // 2. Marcar BIC-E01 con garantia extendida
            e1.activarGarantiaExtendida();

            // 3. Registrar bicicletas en el gestor
            GestorBicicleta gestor = new GestorBicicleta();
            gestor.registrarBicicleta(e1);
            gestor.registrarBicicleta(e2);
            gestor.registrarBicicleta(m1);
            gestor.registrarBicicleta(m2);

            System.out.println();

            // 4. Busqueda por codigo
            String codigoBusqueda = "BIC-E01";
            System.out.println("=== BUSQUEDA POR CODIGO: \"" + codigoBusqueda + "\" ===");
            Bicicleta encontrada = gestor.buscarPorCodigo(codigoBusqueda);

            if (encontrada != null) {
                if (encontrada instanceof BicicletaElectrica) {
                    BicicletaElectrica elec = (BicicletaElectrica) encontrada;
                    System.out.println("Tipo: Bicicleta Eléctrica | Código: " + elec.getCodigo() +
                            " | Año: " + elec.getAnioFabricacion() +
                            " | Peso: " + elec.getPeso() + " kg" +
                            " | Autonomía: " + elec.getAutonomia() + " km" +
                            " | Batería certificada: " + (elec.isBateriaCertificada() ? "Si" : "No"));
                    System.out.println(" Garantia extendida: " + (elec.tieneGarantiaExtendidaActiva() ? "Si" : "No") +
                            " | Costo mantención: $" + (int) elec.calcularCostoMantencion());
                } else if (encontrada instanceof BicicletaMontanya) {
                    BicicletaMontanya mon = (BicicletaMontanya) encontrada;
                    System.out.println("Tipo: Bicicleta de Montaña | Código: " + mon.getCodigo() +
                            " | Año: " + mon.getAnioFabricacion() +
                            " | Peso: " + mon.getPeso() + " kg" +
                            " | Suspensiones: " + mon.getCantidadSuspensiones() +
                            " | Costo mantención: $" + (int) mon.calcularCostoMantencion());
                }
            }

            System.out.println("---\n");

            // 5. Listado general
            System.out.println("=== LISTADO DE BICICLETAS ===");
            for (Bicicleta b : gestor.getBicicletas()) {
                System.out.println(b.toString());
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Error de validación: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }
}