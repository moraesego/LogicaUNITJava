import java.util.Scanner;
public class OrdemNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite três números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int min, mid, max;


        if (num1 <= num2 && num1 <= num3) {
            min = num1; // num1 é o menor

            if (num2 <= num3) {
                mid = num2; // num2 é o médio
                max = num3; // num3 é o maior
            } else {
                mid = num3; // num3 é o médio
                max = num2; // num2 é o maior
            }
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2; // num2 é o menor
            if (num1 <= num3) {
                mid = num1; // num1 é o médio
                max = num3; // num3 é o maior
            } else {
                mid = num3; // num3 é o médio
                max = num1; // num1 é o maior
            }
        } else {
            min = num3; // num3 é o menor
            if (num1 <= num2) {
                mid = num1; // num1 é o médio
                max = num2; // num2 é o maior
            } else {
                mid = num2;
                max = num1;
            }
        }


        System.out.printf("Ordem: %d < %d < %d\n", min, mid, max);
        scanner.close();
    }
}
