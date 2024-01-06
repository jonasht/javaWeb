// Escreva um programa que
//  determine se um número é par ou ímpar 
// (um número par é divisível por 2, ou seja, tem resto 0).  

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        System.out.print("digite um numero:");
        Scanner etd = new Scanner(System.in);
        int numero = etd.nextInt();
            
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        if (numero % 2 == 0){
            System.out.printf("numero %d é par", numero);
        } else {
            System.out.printf("numero %d é impar", numero);
        }
        System.out.println();
    }
}
