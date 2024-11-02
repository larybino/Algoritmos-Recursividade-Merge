public class InverterString {
    public static void main(String[] args) {
        System.out.println(inverter("palavra"));
    }

    public static String inverter(String palavra){
        if(palavra.length()!=0){
            return palavra.charAt(palavra.length()-1) + 
            inverter(palavra.substring(0, palavra.length()-1));
        }
        return null;
    }
}
