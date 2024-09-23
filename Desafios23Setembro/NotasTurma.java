import java.util.Scanner;

public class NotasTurma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número de alunos na turma: ");
        int numAlunos = scanner.nextInt();
        scanner.nextLine();


        String[] nomes = new String[numAlunos];
        double[] notas = new double[numAlunos];

        double soma = 0;
        double maiorNota = 0;
        double menorNota = 0;
        int countAbaixo6 = 0;
        int countAcima8 = 0;


        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite a nota do aluno " + nomes[i] + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
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

            if (notas[i] < 6.0) {
                countAbaixo6++;
            }
            if (notas[i] > 8.0) {
                countAcima8++;
            }
        }


        double media = soma / numAlunos;


        System.out.println("\nNotas dos alunos:");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Aluno: " + nomes[i] + " - Nota: " + notas[i]);
        }


        System.out.println("\nMédia geral da turma: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Número de alunos com nota abaixo de 6,0: " + countAbaixo6);
        System.out.println("Número de alunos com nota acima de 8,0: " + countAcima8);
    }
}
