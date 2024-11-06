package comparacao;

public class Insertion {
    public static void ordenar(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int key = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key;
        }
    }

    public static void imprimirVetor(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}