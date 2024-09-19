import java.util.Scanner;

public class Azulejos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento da cozinha (m): ");
        double comprimento = scanner.nextDouble();
        System.out.print("Digite a largura da cozinha (m): ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura da cozinha (m): ");
        double altura = scanner.nextDouble();


        double areaParedes = 2 * altura * (comprimento + largura);


        int numCaixas = (int) Math.ceil(areaParedes / 1.5);

        System.out.println("Número mínimo de caixas de azulejos necessárias: " + numCaixas);
        scanner.close();
    }
}
