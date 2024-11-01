public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibbonaci(10));
    }

    public static int fibbonaci(int numero) {
        if (numero <= 1) {
            return numero;
        }
        return (fibbonaci(numero - 1)) + fibbonaci(numero-2);
    }
}
