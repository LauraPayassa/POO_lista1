import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float temperatura;
        char escalaAtual, novaEscala;

        // Entrada da temperatura e escala atual
        System.out.print("Digite a temperatura e a escala atual (C/F/K): ");
        temperatura = scanner.nextFloat();
        escalaAtual = scanner.next().toUpperCase().charAt(0); // Lê e converte para maiúsculo

        // Entrada da nova escala
        System.out.print("Digite a nova escala (C/F/K): ");
        novaEscala = scanner.next().toUpperCase().charAt(0); // Lê e converte para maiúsculo

        // Conversão de temperaturas com base nas escalas fornecidas
        if (escalaAtual == 'C' && novaEscala == 'F') {
            System.out.printf("Temperatura em Fahrenheit: %.2f\n", temperatura * 1.8 + 32);
        } else if (escalaAtual == 'F' && novaEscala == 'C') {
            System.out.printf("Temperatura em Celsius: %.2f\n", (temperatura - 32) / 1.8);
        } else if (escalaAtual == 'K' && novaEscala == 'C') {
            System.out.printf("Temperatura em Celsius: %.2f\n", temperatura - 273.15);
        } else if (escalaAtual == 'C' && novaEscala == 'K') {
            System.out.printf("Temperatura em Kelvin: %.2f\n", temperatura + 273.15);
        } else if (escalaAtual == 'K' && novaEscala == 'F') {
            System.out.printf("Temperatura em Fahrenheit: %.2f\n", 1.8 * (temperatura - 273.15) + 32);
        } else {
            System.out.println("Conversão inválida.");
        }

        scanner.close(); // Fecha o scanner
    }
}
