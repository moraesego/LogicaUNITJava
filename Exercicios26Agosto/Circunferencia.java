import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();
        final double PI = 3.1415;

        // Calcula a área e o perímetro
        double area = PI * Math.pow(raio, 2);
        double perimetro = 2 * PI * raio;

        System.out.printf("Área: %.2f m²\n", area);
        System.out.printf("Perímetro: %.2f m\n", perimetro);
        scanner.close();
    }
}
