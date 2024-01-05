    // 1) Escreva um programa que 
    // inicie uma contagem regressiva a partir de um número especificado pelo usuário até zero, 
    // utilizando um loop while.

import java.util.Scanner;

public class proj1 {

    public static void main(String[] args) {
        
        System.out.print("n:");
        Scanner etd = new Scanner(System.in);
        int numero = etd.nextInt();

        while (numero != -1) {
            System.out.println(numero);
            numero = numero-1;
  
        }



    }
}