import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("As notas possuem valor de 0 a 100.");


        System.out.print("Digite a nota de Matemática: ");
        double NotaMatematica = scanner.nextDouble();

        System.out.print("Digite a nota de Física: ");
        double NotaFisica = scanner.nextDouble();

        System.out.print("Digite a nota de Química: ");
        double NotaQuimica = scanner.nextDouble();

        System.out.print("Digite a nota de Biologia: ");
        double NotaBiologia = scanner.nextDouble();

        System.out.print("Digite a nota de Filosofia: ");
        double NotaFilosofia = scanner.nextDouble();

        System.out.print("Digite a nota de Inglês: ");
        double NotaIngles = scanner.nextDouble();

        System.out.print("Digite a nota de Geografia: ");
        double NotaGeografia = scanner.nextDouble();

        System.out.print("Digite a nota de História: ");
        double NotaHistoria = scanner.nextDouble();

        System.out.print("Digite a nota de Sociologia: ");
        double NotaSociologia = scanner.nextDouble();

        System.out.print("Digite a nota de Português: ");
        double NotaPortugues = scanner.nextDouble();


        if (NotaMatematica == 0 || NotaFisica == 0 || NotaQuimica == 0 || NotaBiologia == 0 ||
                NotaFilosofia == 0 || NotaIngles == 0 || NotaGeografia == 0 || NotaHistoria == 0 ||
                NotaSociologia == 0 || NotaPortugues == 0) {

            System.out.println("Eliminado");
            return;
        }


        double totalPesos = 2 + 2 + 1 + 2 + 0.5 + 0.5 + 0.5 + 0.5 + 0.5 + 0.5;
        double pontuacao = (NotaMatematica * 2) + (NotaFisica * 2) + (NotaQuimica * 1) +
                (NotaPortugues * 2) + (NotaFilosofia * 0.5) + (NotaIngles * 0.5) +
                (NotaGeografia * 0.5) + (NotaSociologia * 0.5) + (NotaBiologia * 0.5) + (NotaHistoria * 0.5);


        double situacao = pontuacao / totalPesos;


        System.out.println("Sua pontuação ponderada é: " + situacao);


        if (situacao >= 65.00) {

            System.out.println("Aprovado");
        } else {

            System.out.println("Reprovado");
        }



    }
}
