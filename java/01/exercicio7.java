import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        System.out.println("=-=-=-=-=-=");
        // entrada
        Scanner entrada = new Scanner(System.in);
        double preco = entrada.nextDouble();

        System.out.println("digite o desconto(%):");
        double desconto = entrada.nextDouble();


        // processamento
        double valorADescontar = preco * (desconto/100);
        double precoFinal = preco - valorADescontar;
        System.out.println("o preço é" + precoFinal);
    }
}