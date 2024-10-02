import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, inicio, fim;

        System.out.println("Digite o número a ser verificado:");
        numero = scanner.nextInt();
        System.out.println("Digite o início do intervalo:");
        inicio = scanner.nextInt();
        System.out.println("Digite o fim do intervalo:");
        fim = scanner.nextInt();

        if (numero >= inicio && numero <= fim)
            System.out.println(numero + " está dentro do intervalo [" + inicio + ", " + fim + "].");
        else
            System.out.println(numero + " não está dentro do intervalo [" + inicio + ", " + fim + "].");
    }
}
