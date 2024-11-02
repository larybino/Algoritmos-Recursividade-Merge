public class Matriz {
   public static void main(String[] args) {
		int vetor[][] = {{2,1,4}, { 5,3,7}};
        for(int i=0; i<vetor.length; i++){
            int auxiliar[] = new int[vetor[i].length];
            merge(vetor[i], auxiliar, 0, vetor[i].length-1); 
        }
		for(int i=0; i<vetor.length; i++){
            System.out.print("[");
            for(int j=0; j<vetor[i].length; j++){
                System.out.print(vetor[i][j]);
                if (j < vetor[i].length - 1) {
                    System.out.print(", "); 
                }
            }
            System.out.println("]");
        }
   }

    public static void merge(int vetor[], int auxiliar[], int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			merge(vetor, auxiliar, inicio, meio);
			merge(vetor, auxiliar, meio + 1, fim);
			intercalacao(vetor, auxiliar, inicio, meio, fim);
		}
	}

	public static void intercalacao(int[] vetor, int[] auxiliar, int inicio,
			int meio, int fim) {
		for (int x = inicio; x <= fim; x++) {
			auxiliar[x] = vetor[x];
		}
		int esquerda = inicio;
		int direita = meio + 1;

		for (int x = inicio; x <= fim; x++) {
			if (esquerda > meio) {
				vetor[x] = auxiliar[direita++];
			} else if (direita > fim) {
				vetor[x] = auxiliar[esquerda++];
			} else if (auxiliar[esquerda] < auxiliar[direita]) {
				vetor[x] = auxiliar[esquerda++];
			} else {
				vetor[x] = auxiliar[direita++];
			}
		}
	}
}
