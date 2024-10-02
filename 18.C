#include <stdio.h>

int main() {
    int num, inicio, fim;
    
    printf("Digite o número a ser verificado: ");
    scanf("%d", &num);
    printf("Digite o início do intervalo: ");
    scanf("%d", &inicio);
    printf("Digite o fim do intervalo: ");
    scanf("%d", &fim);
    
    if (num >= inicio && num <= fim)
        printf("%d está dentro do intervalo [%d, %d].\n", num, inicio, fim);
    else
        printf("%d não está dentro do intervalo [%d, %d].\n", num, inicio, fim);
    
    return 0;
}
