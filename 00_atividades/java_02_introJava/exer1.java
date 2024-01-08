    // Crie um programa que solicite dois números e realize operações básicas 
    // (1 - adição, 2 - subtração, 3 - multiplicação, 4 - divisão) com base na escolha do usuário.  

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner etd1 = new Scanner(System.in);
        Scanner etd2 = new Scanner(System.in);
        Scanner etdop = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("numero1:");
        int numero1 = etd1.nextInt();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.printf("%d?x=x\n", numero1);

        System.out.print("numero2:");
        int numero2 = etd2.nextInt();
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.printf("%d?%d=x\n", numero1, numero2);

        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("\t1-adição\n\t2-subtração\n\t3-multiplicação\n\t4-divisão\nop:");
        int opcao = etdop.nextInt();
        etd1.close();
        etd2.close();
        etdop.close();
        
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        switch (opcao) {
            case 1:
                System.out.printf("%d+%d=%d\n", numero1, numero2, numero1+numero2);

                break;
            case 2:
                System.out.printf("%d-%d=%d\n", numero1, numero2, numero1-numero2);
            
                break;
            case 3:
                System.out.printf("%dX%d=%d\n", numero1, numero2, numero1*numero2);
            
                break;
            case 4:
                System.out.printf("%d/%d=%d\n", numero1, numero2, numero1/numero2);
            
                break;
            default:
                break;
        }


    }
}


