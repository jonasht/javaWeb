    // 3) Faça um programa que solicite ao usuário um número e
    //  calcule a soma de todos os números pares de 0 até o número inserido,
    //  utilizando um loop for. Se for digitado o número 20,
    //  será somado 0 + 2 + 4 + 8 + ... + 18 + 20.

import java.util.Scanner;

public class proj3 {
    public static void main(String[] args) {
        System.out.print("numero:");
        Scanner etd = new Scanner(System.in);
        int numero = etd.nextInt();

        int soma = 0;

        for (int i = 0; i <= numero; i+=2){
            
            System.out.printf("numero:%2d|soma:%2d\n", i, soma);
            soma += i;

        }
        System.out.printf("resultado %d", soma);
        System.out.println();
    }
}
