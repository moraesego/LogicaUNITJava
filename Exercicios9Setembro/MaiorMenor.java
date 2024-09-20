import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0; // Inicializa o maior valor
        int menor = 0; // Inicializa o menor valor
        boolean primeiroValor = true; // Para verificar se é o primeiro valor
        int valor;

        while (true) {
            System.out.print("Digite um valor positivo (ou negativo para encerrar): ");
            valor = scanner.nextInt();

            if (valor < 0) {
                break; // Encerra o loop se o valor for negativo
            }

            if (primeiroValor) {
                maior = valor; // Define o maior e menor como o primeiro valor
                menor = valor;
                primeiroValor = false; // Atualiza a flag
            } else {
                if (valor > maior) {
                    maior = valor; // Atualiza o maior
                }
                if (valor < menor) {
                    menor = valor; // Atualiza o menor
                }
            }
        }

        if (!primeiroValor) { // Verifica se algum valor foi inserido
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi inserido.");
        }

        scanner.close();
    }
}
