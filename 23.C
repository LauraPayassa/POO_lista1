#include <stdio.h>

int main() {
    float lado1, lado2, lado3;
    
    printf("Digite os três lados do triângulo: ");
    scanf("%f %f %f", &lado1, &lado2, &lado3);
    
    if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
        if (lado1 == lado2 && lado2 == lado3) {
            printf("Triângulo Equilátero: três lados iguais.\n");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            printf("Triângulo Isósceles: dois lados iguais.\n");
        } else {
            printf("Triângulo Escaleno: três lados diferentes.\n");
        }
    } else {
        printf("Os valores não formam um triângulo.\n");
    }
    
    return 0;
}
