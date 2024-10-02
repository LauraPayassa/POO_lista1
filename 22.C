#include <stdio.h>

int main() {
    float av1, av2, av3, media;
    
    printf("Digite as notas AV1 e AV2: ");
    scanf("%f %f", &av1, &av2);
    
    media = (av1 + av2) / 2;
    
    if (media < 6) {
        printf("Média insuficiente. Digite a nota AV3: ");
        scanf("%f", &av3);
        
        if (av1 < av2) {
            av1 = av3;
        } else {
            av2 = av3;
        }
        
        media = (av1 + av2) / 2;
    }
    
    if (media >= 6) {
        printf("Aprovado com média %.2f\n", media);
    } else {
        printf("Reprovado com média %.2f\n", media);
    }
    
    return 0;
}
