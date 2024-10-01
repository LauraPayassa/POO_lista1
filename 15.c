#include <stdio.h>

int main() {
    int A, B, C;
    
    printf("Digite três números:\n");
    scanf("%d %d %d", &A, &B, &C);
    
    int maior = A;
    int menor = A;
    
    if (B > maior)
        maior = B;
    if (C > maior)
        maior = C;
    
    if (B < menor)
        menor = B;
    if (C < menor)
        menor = C;
    
    printf("Maior número: %d\n", maior);
    printf("Menor número: %d\n", menor);
    
    return 0;
}
