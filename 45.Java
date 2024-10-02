import java.util.Scanner;

public class IdadeAlturaInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[5];
        float[] alturas = new float[5];

        System.out.println("Digite a idade e a altura de 5 pessoas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            System.out.print("Altura: ");
            alturas[i] = scanner.nextFloat();
        }

        System.out.println("Idades e alturas na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Pessoa " + (i + 1) + ": Idade = " + idades[i] + ", Altura = " + alturas[i]);
        }
    }
}
