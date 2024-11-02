public class ArrayString {
public static void main(String[] args) {
    String palavras[]= {"oi", "tudo", "bem"};
    String auxiliar[]= new String[palavras.length];
    merge(palavras, auxiliar, 0, palavras.length-1);
    for (String palavra : palavras) {
        System.out.println(palavra);
    } 
}

    public static void merge(String vetor[], String auxiliar[], int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			merge(vetor, auxiliar, inicio, meio);
			merge(vetor, auxiliar, meio + 1, fim);
			intercalacao(vetor, auxiliar, inicio, meio, fim);
		}
	}

	public static void intercalacao(String[] vetor, String[] auxiliar, int inicio,
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
			} else if (auxiliar[esquerda].charAt(0) < auxiliar[direita].charAt(0)) {
				vetor[x] = auxiliar[esquerda++];
			} else {
				vetor[x] = auxiliar[direita++];
			}
		}
	}
}
