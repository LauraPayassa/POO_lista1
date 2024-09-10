#include <stdio.h>

int main() {
    float temperatura;
    char escala_atual, nova_escala;
    
    printf("Digite a temperatura e a escala atual (C/F/K): ");
    scanf("%f %c", &temperatura, &escala_atual);
    
    printf("Digite a nova escala (C/F/K): ");
    scanf(" %c", &nova_escala);
    
    if (escala_atual == 'C' && nova_escala == 'F') {
        printf("Temperatura em Fahrenheit: %.2f\n", temperatura * 1.8 + 32);
    } else if (escala_atual == 'F' && nova_escala == 'C') {
        printf("Temperatura em Celsius: %.2f\n", (temperatura - 32) / 1.8);
    } else if (escala_atual == 'K' && nova_escala == 'C') {
        printf("Temperatura em Celsius: %.2f\n", temperatura - 273.15);
    } else if (escala_atual == 'C' && nova_escala == 'K') {
        printf("Temperatura em Kelvin: %.2f\n", temperatura + 273.15);
    } else if (escala_atual == 'K' && nova_escala == 'F') {
        printf("Temperatura em Fahrenheit: %.2f\n", 1.8 * (temperatura - 273) + 32);
    } else {
        printf("Conversão inválida.\n");
    }
    
    return 0;
}
