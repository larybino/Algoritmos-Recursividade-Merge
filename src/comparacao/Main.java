package comparacao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] tamanhos = {1000, 10000, 100000, 1000000}; 
        int execucoes = 10; 
        System.out.printf("%-15s", "Tamanho");
        for (int i = 1; i <= execucoes; i++) {
            System.out.printf("%-15s", "Execução " + i);
        }
        System.out.println();
        for (int tamanho : tamanhos) {
            int[] vetor = ArrayAleatorio.gerador(tamanho);
            System.out.printf("%-15d%n", tamanho);
            List<Long> bubble =tempoAlgoritmo("BubbleSort", vetor, execucoes, Bubble::sort);
            List<Long> selection =tempoAlgoritmo("SelectionSort", vetor, execucoes, Selection::selectionSort);
            List<Long> insertion=tempoAlgoritmo("InsertionSort", vetor, execucoes, Insertion::ordenar);
            List<Long> merge =tempoAlgoritmo("MergeSort", vetor, execucoes, Merge::sort);
            tabela("Bubble Sort", bubble);
            tabela("Selection Sort", selection);
            tabela("Insertion Sort", insertion);
            tabela("Merge Sort", merge);
            System.out.println();
       }
    }

    private static List<Long> tempoAlgoritmo(String algoritmoOrdenacao, int[] vetor, int execucoes, Ordenacao algoritmo) {
        List<Long> tempo = new ArrayList<>();
        for (int i = 0; i < execucoes; i++) {
            int[] copiaVetor = vetor.clone(); 
            long comeco = System.nanoTime();
            algoritmo.sort(copiaVetor);
            long fim = System.nanoTime();
            tempo.add(fim - comeco);
        }
        return tempo;
    }

    private static void tabela(String algoritmo, List<Long> tempos) {
        System.out.printf("%-15s", algoritmo);
        for (Long tempo : tempos) {
            System.out.printf("%-15s", tempo + " ns");
        }
        System.out.println();
    }

    @FunctionalInterface
    interface Ordenacao {
        void sort(int[] vetor);
    }
}
