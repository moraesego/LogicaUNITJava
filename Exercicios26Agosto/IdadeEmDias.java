import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Calcula a quantidade de dias
        int diasVividos = idade * 365;

        System.out.println("Você viveu aproximadamente " + diasVividos + " dias.");
        scanner.close();
    }
}
