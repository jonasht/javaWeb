import java.util.Scanner;

public class exer6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        limparTela();
        printSep();
        System.out.print("Digite a nota (de 0 a 100): ");
        int nota = scanner.nextInt();

        scanner.close();

        limparTela();
        printSep();
        
        char conceito = converterParaConceito(nota);
        System.out.println("nota em numero:"+nota);
        System.out.println("nota: " + conceito);
        printSep();
    }
        
    public static void printSep(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    public static void limparTela() {
        for (int i = 0; i < 50; ++i) System.out.println();  
    }
    public static char converterParaConceito(int nota) {
        if (nota<= 20) {
            return 'F';
        } else if (nota<=40) {
            return 'D';
        } else if (nota <= 60) {
            return 'C';
        } else if (nota <= 80) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
