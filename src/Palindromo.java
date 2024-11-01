public class Palindromo {
    public static void main(String[] args) {
        String palavra= "mirim";
        System.out.println(merge(palavra, 0, palavra.length() -1));
        System.out.println(palavra);
       
    }

    private static boolean merge(String palavra, int inicio, int fim) {
        System.out.println(inicio+" "+fim);
        if (inicio < fim) {
            if(palavra.charAt(inicio)==palavra.charAt(fim)){
                return merge(palavra, inicio+1, fim-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
