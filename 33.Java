import java.util.Scanner;

public class DiferenciarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, maior, menor;

        System.out.println("Digite três números:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        maior = a;
        menor = a;

        if (b > maior) maior = b;
        if (c > maior) maior = c;

        if (b < menor) menor = b;
        if (c < menor) menor = c;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
