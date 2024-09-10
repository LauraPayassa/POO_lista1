import java.util.Scanner;

public class ProcessarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0, maior = 0, menor = 0;

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];

            if (i == 0) {
                maior = menor = numeros[i];
            } else {
                if (numeros[i] > maior)
                    maior = numeros[i];
                if (numeros[i] < menor)
                    menor = numeros[i];
            }
        }

        float media = soma / 10.0f;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}
