import java.util.Arrays;

public class SomaRecursiva {
    public static void main(String[] args) {
        SomaRecursiva somaRecursiva= new SomaRecursiva();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(somaRecursiva.soma(array));
    }

    public int soma(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        int SomaParcial = array[0] + soma(Arrays.copyOfRange(array, 1, array.length));
        return SomaParcial;
    }
}
