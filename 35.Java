import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean ehPrimo = true;

        System.out.println("Digite um número inteiro:");
        num = scanner.nextInt();

        if (num <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo)
            System.out.println(num + " é primo.");
        else
            System.out.println(num + " não é primo.");
    }
}
