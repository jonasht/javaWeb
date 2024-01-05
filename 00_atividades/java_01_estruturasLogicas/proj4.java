import java.util.Random;
import java.util.Scanner;

public class proj4 {
 public static void main(String[] args) {
    int numeroAleatorio = 10;
    Random gerador = new Random();

    Scanner etd = new Scanner(System.in);
    int numero;
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

    for (int i = 0; i<10; i++){
        // System.out.println(gerador.nextInt(1, 10));
        System.out.println("------------------------------------");
        System.out.printf("\ttentativas %d/10\n", i);
        System.out.println("------------------------------------");
        System.out.print("chute um numero:");
        numero = etd.nextInt();
        
        if (numero == numeroAleatorio){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

            System.out.printf("o numero %d chutado correto\n", numero);
            break;
        } else if (numero < numeroAleatorio){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

            System.out.printf("%d>X| numero x é maior q %2d\n", numero, numero);
        } else if (numero > numeroAleatorio){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

            System.out.printf("X<%dnumero x é menor q %2d", numero, numero);

        }
    }
 }   
}
