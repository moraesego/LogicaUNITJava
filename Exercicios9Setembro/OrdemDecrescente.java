import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        while (numero > 0) {
            System.out.println(numero);
            numero--;
        }

        scanner.close();
    }
}
