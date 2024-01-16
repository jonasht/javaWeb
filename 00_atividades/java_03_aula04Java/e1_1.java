import java.util.Arrays;

public class e1_1 {

    public static void main(String[] args) {
        int[] numeros = {8, 9, 2, 4, 5, 41, 100, 25, 47, 63};
        encontrarMaior(numeros);
        limpar();
        System.out.printf("numeros:%s%n", Arrays.toString(numeros));
        System.out.printf("Maior elemento: %d \n", encontrarMaior(numeros));
    }

    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }

    public static void limpar(){
        for (int i = 0; i<40;i++) System.out.println();
    }
}
