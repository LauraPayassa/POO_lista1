import java.util.Scanner;

public class ProcessarIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, soma = 0, count = 0, maior = 0, menor = Integer.MAX_VALUE;

        System.out.println("Digite as idades (0 para encerrar):");

        while (true) {
            idade = scanner.nextInt();
            if (idade == 0) break;

            soma += idade;
            count++;

            if (idade > maior) maior = idade;
            if (idade < menor) menor = idade;
        }

        if (count > 0) {
            float media = (float) soma / count;
            System.out.println("Número de pessoas: " + count);
            System.out.printf("Idade média: %.2f%n", media);
            System.out.println("Maior idade: " + maior);
            System.out.println("Menor idade: " + menor);
        } else {
            System.out.println("Nenhuma idade foi digitada.");
        }
    }
}
