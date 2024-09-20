import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Informe um número entre 1 e 10: ");
            n = scanner.nextInt();
        } while (n < 1 || n > 10);

        int a = 0, b = 1;
        System.out.print("Série de Fibonacci: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int proximo = a + b;
            System.out.print(" " + proximo);
            a = b;
            b = proximo;
        }

        scanner.close();
    }
}
