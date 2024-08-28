import java.util.Arrays;

public class Questao1 {
    public static void main(String[] args) {

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorB = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean[] vetorC = new boolean[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            int resultado = vetorA[i] * vetorB[i];
            vetorC[i] = resultado % 2 == 0;
        }

        System.out.println(Arrays.toString(vetorC));

    }
}







