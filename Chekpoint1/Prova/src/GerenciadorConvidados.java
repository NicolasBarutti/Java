import java.util.Arrays;

public class GerenciadorConvidados {

    private String[] nomes;

    public GerenciadorConvidados() {
        this.nomes = new String[0];
    }

    public void adicionarConvidado(String i) {
        nomes = Arrays.copyOf(nomes, nomes.length + 1);
        nomes[nomes.length - 1] = i;
    }



    public void print(){
        System.out.println(Arrays.toString(nomes));
    }
}
