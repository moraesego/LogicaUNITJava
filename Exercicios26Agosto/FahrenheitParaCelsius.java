import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Converte para Celsius
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        System.out.printf("Temperatura em Celsius: %.2f°C\n", celsius);
        scanner.close();
    }
}

