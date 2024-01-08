import java.util.Scanner;

public class exer7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        limparTela();
        printSep();

        System.out.print("digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        limparTela();
        printSep();

        System.out.print("digite a porcentagem de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        scanner.close();

        double precoFinal = calcularPrecoComDesconto(precoProduto, percentualDesconto);
        limparTela();
        printSep();

        System.out.printf("com %.0f%% de desconto, o preço final é: R$%.2f\n", percentualDesconto, precoFinal);
        printSep();
 
        
    }
    public static void printSep(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    public static void limparTela() {
        for (int i = 0; i < 50; ++i) System.out.println();  
    }
    public static double calcularPrecoComDesconto(double precoProduto, double percentualDesconto) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            System.out.println("porcentagem de desconto inválida. deve estar entre 0 e 100.");
            System.exit(1);  // Encerra o programa em caso de erro.
        }

        double desconto = (percentualDesconto / 100) * precoProduto;
        return precoProduto - desconto;
    }
}
