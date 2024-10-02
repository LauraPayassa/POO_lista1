import java.util.Scanner;

public class OperacoesVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0, multiplicacao = 1;

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.println("Soma dos números: " + soma);
        System.out.println("Multiplicação dos números: " + multiplicacao);
        System.out.println("Números:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
