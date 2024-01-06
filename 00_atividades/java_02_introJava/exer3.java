// Peça ao usuário para inserir três números e exiba o maior deles. 

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        Scanner scanner = new Scanner(System.in);
        System.out.print("com espaço\ninsira 3 numeros:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        scanner.close();
        
        // numero maior
        int maiorValor = Math.max(Math.max(numero1, numero2), numero3);
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\tnumeros digitas:");
        System.out.printf("\t%d %d %d\n", numero1, numero2, numero3);
        System.out.printf("\tmaior numero: %d\n", maiorValor);        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");



    }
}
