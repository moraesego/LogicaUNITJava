import java.util.Scanner;

public class NotasTurma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário o número de alunos
        System.out.print("Digite o número de alunos na turma: ");
        int numAlunos = scanner.nextInt();

        // Criar um vetor para armazenar as notas com o tamanho baseado no número de alunos
        double[] notas = new double[numAlunos];


        double soma = 0;
        double maiorNota = 0;
        double menorNota = 0;


        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i +1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];


            if (i == 0) {
                maiorNota = notas[i];
                menorNota = notas[i];
            } else {
                if (notas[i] > maiorNota) {
                    maiorNota = notas[i];
                }
                if (notas[i] < menorNota) {
                    menorNota = notas[i];
                }
            }
        }


        double media = soma / numAlunos;


        System.out.println("\nMédia geral da turma: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
    }
}
