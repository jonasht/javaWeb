// - Verificar se uma string é um palíndromo (leitura igual de trás para frente).

public class e2_3 {
    public static void main(String[] args) {
        String texto = "anotaram a data da maratona";
        limpar();
        System.out.printf("texto: %s%n", texto);

        if (ehPalindromo(texto)) {
            System.out.println("é um palíndromo.");
        } else {
            System.out.println("não é um palíndromo.");
        }
    }

    public static boolean ehPalindromo(String texto) {
        String textoSemEspacos = texto.replaceAll("\\s", "").toLowerCase();

        int comprimento = textoSemEspacos.length();

        for (int i = 0; i < comprimento / 2; i++) {
            if (textoSemEspacos.charAt(i) != textoSemEspacos.charAt(comprimento - 1 - i)) {
                return false; 
            }
        }

        return true; 
    }

    public static void limpar() {
        for (int i = 0; i < 40; i++) System.out.println();
    }
}
