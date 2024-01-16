import java.util.Arrays;

public class e1_2 {

    public static void main(String[] args) {
        int[] numeros = {8, 9, 2, 4, 5, 41, 100, 25, 47, 63};
        // int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numerosInvertidos = inverterArray(numeros);
        limpar();
        System.out.printf("   numeros normais: %s%n", Arrays.toString(numeros));
        System.out.printf("numeros invertidos: %s%n", Arrays.toString(numerosInvertidos));
    }

    public static int[] inverterArray(int[] numeros) {
        int[] numerosInvertidos = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            numerosInvertidos[i] = numeros[numeros.length - i - 1];
        }

        return numerosInvertidos;
    }
    public static void limpar(){
        for (int i = 0; i<40;i++) System.out.println();
    }
}
