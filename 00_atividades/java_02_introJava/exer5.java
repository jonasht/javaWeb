import java.util.Scanner;

public class exer5 {

    public static void main(String[] args) {
        limparTela();
        printSep();
        System.out.println("use , no lugar de .");
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o peso: ");
        double peso = Double.parseDouble(scanner.next().replace(",", "."));


        limparTela();
        printSep();
        System.out.println("peso: " + peso);
        System.out.print("digite a altura: ");
        double altura = Double.parseDouble(scanner.next().replace(",", "."));

        scanner.close();
        limparTela();
        printSep();
        
        System.out.print("peso: " + peso +"| altura: "+altura + " | ");

        double imc = calcularImc(peso, altura);

        exibirCategoria(imc);
    }
    public static void printSep(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    public static void limparTela() {
        for (int i = 0; i < 50; ++i) System.out.println();  
    }
    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void exibirCategoria(double imc) {
        System.out.printf("IMC: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.println("Peso normal");
        } else if (imc < 30.0) {
            System.out.println("Sobrepeso");
        } else if (imc < 35.0) {
            System.out.println("Obesidade grau 1");
        } else if (imc < 40.0) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }
        printSep();
    }
}
