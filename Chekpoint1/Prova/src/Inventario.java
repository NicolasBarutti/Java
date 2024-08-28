import java.util.HashMap;
import java.util.Map;

public class Inventario {


    private Map<String, Integer> produtos;


    public Inventario() {
        produtos = new HashMap<>();

    }


    public void adicionarProduto(String produtos, int quantidade) {
    }

    public void mostrarInventario() {
        System.out.println(produtos);

    }

    public static Map<String, Integer> criaInventario(){
        return new HashMap<>();
    }
}


