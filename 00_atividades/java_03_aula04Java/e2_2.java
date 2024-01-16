

public class e2_2 {

    public static void main(String[] args) {
        String texto = "Hello, World!";
        limpar();
        System.out.printf("Texto original: %s%n", texto);
        System.out.print("Texto invertido:");
        inverterString(texto);
        System.out.println();
    }

    public static void inverterString(String texto) {
        char[] caracteres = texto.toCharArray();
        char[] caracteresInvertidos = new char[caracteres.length];

        for (int i = 0; i < caracteres.length; i++) {
            caracteresInvertidos[i] = caracteres[caracteres.length - i - 1];
        }

        for (int i =0; i<caracteresInvertidos.length;i++){
            System.out.print(caracteresInvertidos[i]);
        }
        
    }

    public static void limpar() {
        for (int i = 0; i < 40; i++) System.out.println();
    }
}
