import java.util.Scanner;

public class IntercalarVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorIntercalado = new int[20];

        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int index = 0;
        for (int i = 0; i < 10; i++) {
            vetorIntercalado[index++] = vetor1[i];
            vetorIntercalado[index++] = vetor2[i];
        }

        System.out.println("Vetor intercalado:");
        for (int num : vetorIntercalado) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
