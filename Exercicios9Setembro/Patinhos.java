import java.util.Scanner;

public class Patinhos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de patinhos: ");
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            System.out.println(i + " patinhos foram passear\nAlém das montanhas para brincar\nA mamãe gritou: Quá quá quá quá\nMas só " + (i - 1) + " patinhos voltaram de lá.");
        }
        System.out.println("A mamãe patinha foi procurar\nAlém das montanhas, na beira do mar\nA mamãe gritou: Quá quá quá quá\nE os " + n + " patinhos voltaram de lá.");

        scanner.close();
    }
}

