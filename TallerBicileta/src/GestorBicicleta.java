import java.util.ArrayList;
import java.util.List;

public class GestorBicicleta {
    private List<Bicicleta> bicicletas;

    public GestorBicicleta() {
        this.bicicletas = new ArrayList<>();
    }

    public void registrarBicicleta(Bicicleta bicicleta) {
        if (bicicleta != null) {
            this.bicicletas.add(bicicleta); // Corregido: se agrega a la colección interna 'bicicletas'
            System.out.println(bicicleta.getCodigo() + " (" + bicicleta.getClass().getSimpleName() + ") registrada correctamente.");
        }
    }

    public Bicicleta buscarPorCodigo(String codigo) {
        if (codigo == null) return null;
        for (Bicicleta b : bicicletas) {
            if (b.getCodigo().equalsIgnoreCase(codigo)) { // Corregido: uso de equalsIgnoreCase en lugar de '=='
                return b;
            }
        }
        return null;
    }

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }
}