package comparacao;

import java.util.Random;

public class ArrayAleatorio {
    public static int[] gerador(int tamanho) {
        int[] vetor = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(1000000); 
        }
        return vetor;
    }
}
