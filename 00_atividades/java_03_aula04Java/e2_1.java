

public class e2_1 {
    public static void main(String[] args) {
        String inputString = "banana";
        char letra = 'a';


        int numeroOcorrencias = contarOcorrencias(inputString, letra);
        limpar();
        System.out.println("quantidade de '" + letra + "' = " + numeroOcorrencias);
        
    }
    public static void limpar(){
        for (int i=0; i<40; i++) System.out.println();
    }
    public static int contarOcorrencias(String str, char letra) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letra) count++;
        }

        return count;
    }
}
