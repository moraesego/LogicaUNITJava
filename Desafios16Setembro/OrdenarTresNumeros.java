import java.util.Scanner;

public class OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();


        double menor = Math.min(num1, Math.min(num2, num3));
        double maior = Math.max(num1, Math.max(num2, num3));
        double meio = num1 + num2 + num3 - menor - maior;


        System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);


    }
}

