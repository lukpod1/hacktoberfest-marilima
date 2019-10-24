import java.util.ArrayList;
import java.util.List;

public class Crud {
    List<String> lista;

    public Crud(List<String> lista) {
        this.lista = lista;
    }

    public void adicionar(String item) {
        this.lista.add(item);
    }

    public void remover(Integer index) {
        this.lista.remove(index);
    }

    public void listar(){
        this.lista.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        Crud c1 = new Crud(l1);
        c1.adicionar("Java");
    }
}
