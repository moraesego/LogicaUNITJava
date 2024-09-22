import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();
        System.out.print("Digite o valor de Z: ");
        int z = scanner.nextInt();


        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z) {
                System.out.println("Triângulo Equilátero.");
            } else if (x == y || y == z || x == z) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }


    }
}
