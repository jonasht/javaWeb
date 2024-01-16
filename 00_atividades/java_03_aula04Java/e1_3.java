import java.util.Arrays;

public class e1_3 {
    public static void main(String[] args) {
        int[] numeros = {8, 9, 2, 4, 5, 41, 100, 25, 47, 63};
        int numeroAEncontrar = 100;

        if (findNumber(numeros, numeroAEncontrar)) {
            System.out.println("numero encontrado");
        } else {
            System.out.println("numero nao encontrado");
        }
    }

    public static boolean findNumber(int[] numeros, int numeroAEncontrar) {
        Arrays.sort(numeros);
        int indice = Arrays.binarySearch(numeros, numeroAEncontrar);

        return indice >= 0;
    }
}
