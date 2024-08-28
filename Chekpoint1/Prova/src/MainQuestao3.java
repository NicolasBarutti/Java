import java.util.Arrays;

public class MainQuestao3 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();


        inventario.adicionarProduto("maçã", 50);
        inventario.adicionarProduto("banana", 30);
        inventario.adicionarProduto("laranja", 20);

        inventario.mostrarInventario();



    }
}

