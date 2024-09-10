import java.util.Scanner;

public class VetoresParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int countPares = 0, countImpares = 0;

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[countPares++] = numeros[i];
            } else {
                impares[countImpares++] = numeros[i];
            }
        }

        System.out.println("Vetor de números pares:");
        for (int i = 0; i < countPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor de números ímpares:");
        for (int i = 0; i < countImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}
