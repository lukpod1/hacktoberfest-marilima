import java.util.ArrayList;
import java.util.List;

public class Crud {
    List<String> lista;

    public Crud(List<String> lista) {
        this.lista = lista;
    }

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        Crud c1 = new Crud(l1);
    }
}
