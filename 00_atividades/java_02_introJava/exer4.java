import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão desejada:");
        System.out.println("1-Celsius para Fahrenheit");
        System.out.println("2-Fahrenheit para Celsius");
        System.out.print("op:");
        int escolha = scanner.nextInt();

        double temperaturaCelsius, temperaturaFahrenheit;

        switch (escolha) {
            case 1:
                System.out.print("Digite a temperatura em Celsius:");
                temperaturaCelsius = scanner.nextDouble();
                temperaturaFahrenheit = celsiusParaFahrenheit(temperaturaCelsius);
                System.out.println("temperatura em Fahrenheit: " + temperaturaFahrenheit);
                break;
            case 2:
                System.out.print("Digite temperatura em Fahrenheit:");
                temperaturaFahrenheit = scanner.nextDouble();
                temperaturaCelsius = fahrenheitParaCelsius(temperaturaFahrenheit);
                System.out.println("temperatura em Celsius: " + temperaturaCelsius);
                break;
            default:
                System.out.println("Escolha inválid. escolha 1 ou 2.");
        }

        scanner.close();
    }

    private static double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9/5) + 32;
    }

    private static double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5/9;
    }
}
