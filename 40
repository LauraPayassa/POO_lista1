import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float av1, av2, av3, media;

        System.out.println("Digite as notas AV1 e AV2:");
        av1 = scanner.nextFloat();
        av2 = scanner.nextFloat();

        media = (av1 + av2) / 2;

        if (media < 6) {
            System.out.println("Média insuficiente. Digite a nota AV3:");
            av3 = scanner.nextFloat();

            if (av1 < av2) {
                av1 = av3;
            } else {
                av2 = av3;
            }

            media = (av1 + av2) / 2;
        }

        if (media >= 6) {
            System.out.printf("Aprovado com média %.2f%n", media);
        } else {
            System.out.printf("Reprovado com média %.2f%n", media);
        }
    }
}
