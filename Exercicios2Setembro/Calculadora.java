import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.printf("Resultado: %.2f\n", num1 + num2);
                break;
            case '-':
                System.out.printf("Resultado: %.2f\n", num1 - num2);
                break;
            case '*':
                System.out.printf("Resultado: %.2f\n", num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("Resultado: %.2f\n", num1 / num2);
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }
        scanner.close();
    }
}
