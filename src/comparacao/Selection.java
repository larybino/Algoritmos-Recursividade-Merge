package comparacao;

public class Selection {
    public static void selectionSort(int vetor[]) {
        int tamanho = vetor.length;
        for (int x = 0; x < tamanho; x++) {
            int indiceMenor = x;
            for (int y = indiceMenor + 1; y < tamanho; y++) {
                if (vetor[y] < vetor[indiceMenor]) {
                    indiceMenor = y;
                }
            }
            if (indiceMenor != x) {
                int temp = vetor[x];
                vetor[x] = vetor[indiceMenor];
                vetor[indiceMenor] = temp;

            }
        }
    }
}
