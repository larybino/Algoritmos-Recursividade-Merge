public class CaracterRecursivo {
    public static void main(String[] args) {
        CaracterRecursivo caracterRecursivo= new CaracterRecursivo();
        String palavra= "Arara";
        char caracter= 'a';
        System.out.println(caracterRecursivo.contarCaracter(palavra, caracter));
    }

    public int contarCaracter(String palavra, char caracter) {
        palavra= palavra.toLowerCase();
        caracter=Character.toLowerCase(caracter);
        int contador = 0;
        if (palavra.length() == 0) {
            return contador;
        }
        if (palavra.charAt(0) == caracter) {
            contador++;
        }
        return contador + contarCaracter(palavra.substring(1), caracter);
    }

    
}

