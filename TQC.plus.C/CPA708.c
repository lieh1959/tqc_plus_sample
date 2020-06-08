/* TQC+ C - 708 */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define random(x) rand()%x+1
/* 亂數要從1~100，所以需要設定成 rand()%x+1 ，rand()%x 為0~99 */

int main()
{
    int i, j;
    int x;

    printf("隨機數的最大值為: ");
    scanf("%d", &x);
    for (i=0; i<5; i++) {  /* 初始值i=0開始 */
        for (j=0; j<4; j++) {  /* 初始值j=0開始 */
            printf("%5d ", random(x));
        }
        printf("\n");
    }
    system("PAUSE");

    return 0;
}
