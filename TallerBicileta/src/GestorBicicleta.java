import java.util.ArrayList;
import java.util.List;

public class GestorBicicleta {
    private List<Bicicleta> bicicletas;

    public GestorBicicleta() {
        this.bicicletas = new ArrayList<>();;
    }

    public void registrarBicicleta(Bicicleta bicicletas) {
        if (bicicletas != null) {
            bicicletas.add(bicicletas);
            System.out.println(bicicletas.getCodigoBicicleta() + " (" + bicicletas.getClass().getSimpleName() + ") registrada correctamente.");;
        }
    }

    public Bicicleta buscarBicicletaCodigo(String codigoBicicleta) {
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getCodigoBicicleta() == codigoBicicleta) {
                return bicicleta;
            }
        }
        return null;
    }

    public List<Bicicleta> buscarBicicletas() {
        return bicicletas;
    }

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }
}
