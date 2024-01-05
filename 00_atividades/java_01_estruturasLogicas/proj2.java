//  2) Peça ao usuário para inserir um número e
//  exiba a tabuada desse número de 1 a 10 usando um loop for.

import java.util.Scanner;

public class proj2 {
    public static void main(String[] args) {
        System.out.print("numero:");
        Scanner etd = new Scanner(System.in);
        int numero = etd.nextInt();

        // int numero = 10;
        for  (int i = 1; i < 11; i++){
            System.out.printf("%2d X %d = %2d%n", i, numero, i * numero);

        }
    }
}
