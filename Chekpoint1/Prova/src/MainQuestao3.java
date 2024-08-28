import java.util.Arrays;
import java.util.Map;

public class MainQuestao3 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();


//        inventario.adicionarProduto(
//        inventario.adicionarProduto(;
//        inventario.adicionarProduto();
//
//        inventario.mostrarInventario();

        Map<String, Integer> inv = Inventario.criaInventario();
        inv.put("maçã", 50);
        inv.put("banana", 30);
        inv.put("laranja", 20);

        System.out.println(inv);



    }
}

