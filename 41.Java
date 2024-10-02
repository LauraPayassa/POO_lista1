import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float lado1, lado2, lado3;

        System.out.println("Digite os três lados do triângulo:");
        lado1 = scanner.nextFloat();
        lado2 = scanner.nextFloat();
        lado3 = scanner.nextFloat();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero: três lados iguais.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles: dois lados iguais.");
            } else {
                System.out.println("Triângulo Escaleno: três lados diferentes.");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }
}
