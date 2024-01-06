import java.util.Scanner;


public class exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        limparTela();
        printSep();
        System.out.println("escolha a conversão desejada:");
        System.out.println("\t1-celsius para Fahrenheit");
        System.out.println("\t2-fahrenheit para Celsius");
        System.out.print("op:");
        int escolha = scanner.nextInt();

        double temperaturaCelsius, temperaturaFahrenheit;

        switch (escolha) {
            case 1:
                limparTela();
                printSep();
                System.out.println("\t1-celsius para Fahrenheit");
                printSep();
                System.out.print("digite a temperatura em Celsius:");
                temperaturaCelsius = scanner.nextDouble();
                temperaturaFahrenheit = celsiusParaFahrenheit(temperaturaCelsius);
                System.out.println("temperatura em Fahrenheit: " + temperaturaFahrenheit);
                break;
            case 2:
                limparTela();
                printSep();
                System.out.println("\t2-fahrenheit para Celsius");
                printSep();
                System.out.print("digite temperatura em Fahrenheit:");
                temperaturaFahrenheit = scanner.nextDouble();
                temperaturaCelsius = fahrenheitParaCelsius(temperaturaFahrenheit);
                System.out.println("temperatura em Celsius: " + temperaturaCelsius);
                break;
            default:
                System.out.println("Escolha inválida. escolha 1 ou 2.");
        }

        scanner.close();
    }

    private static double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9/5) + 32;
    }

    private static double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5/9;
    }

    public static void printSep(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    public static void limparTela() {
        for (int i = 0; i < 50; ++i) System.out.println();  // Imprime 50 novas linhas
    }
    

}
