import java.util.Scanner;

public class MediaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;


        if (media >= 7) {
            System.out.println("Aprovado direto!");
        } else if (media >= 4) {
            System.out.println("Você precisará fazer a prova final.");
            System.out.print("Digite a nota da final: ");
            double notaFinal = scanner.nextDouble();
            double mediaFinal = (media + notaFinal) / 2;

            if (mediaFinal >= 5) {
                System.out.println("Aprovado na final!");
            } else {
                System.out.println("Reprovado na final.");
            }
        } else {
            System.out.println("Reprovado direto!");
        }


    }
}
