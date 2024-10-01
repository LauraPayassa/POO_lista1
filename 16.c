#include <stdio.h>

int main() {
    int numeros[10];
    int soma = 0, maior, menor;
    printf("Digite 10 números:\n");
    for (int i = 0; i < 10; i++) {
        scanf("%d", &numeros[i]);
        soma += numeros[i];
        
        if (i == 0) {
            maior = menor = numeros[i];
        } else {
            if (numeros[i] > maior)
                maior = numeros[i];
            if (numeros[i] < menor)
                menor = numeros[i];
        }
    }
    
    float media = soma / 10.0;
    
    printf("Maior número: %d\n", maior);
    printf("Menor número: %d\n", menor);
    printf("Soma dos números: %d\n", soma);
    printf("Média dos números: %.2f\n", media);
    
    return 0;
}
