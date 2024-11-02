public class OrdenarObjetos {
    
    public static void main(String[] args) {
        Pessoa[] pessoas={
            new Pessoa("Laryssa", 19),
            new Pessoa("Bruna", 17)
        };
        Pessoa[] auxiliar= new Pessoa[pessoas.length];
        merge(pessoas, auxiliar, 0, pessoas.length-1);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

        
        public static void merge(Pessoa vetor[], Pessoa auxiliar[], int inicio, int fim) {
            if (inicio < fim) {
                int meio = (inicio + fim) / 2;
                merge(vetor, auxiliar, inicio, meio);
                merge(vetor, auxiliar, meio + 1, fim);
                intercalacao(vetor, auxiliar, inicio, meio, fim);
            }
        }
    
        public static void intercalacao(Pessoa[] vetor, Pessoa[] auxiliar, int inicio,
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
                } else if (auxiliar[esquerda].getIdade() < auxiliar[direita].getIdade()) {
                    vetor[x] = auxiliar[esquerda++];
                } else {
                    vetor[x] = auxiliar[direita++];
                }
            }
    }

    static class Pessoa{
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    
        public String getNome() {
            return nome;
        }
    
        public int getIdade() {
            return idade;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    '}';
        }

    }
}