public class SomaDigitos {
    public static void main(String[] args){
        System.out.println(soma(11));
    }
    
    public static int soma(int numero){
        if (numero<10){
            return numero;
        }else{
            return (numero%10)+ soma(numero/10);
        }
    }
}
