/* TQC+ C - 404 */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
   int arr[2][3];
   int i, j;

    for(i=0; i<2; i++) {
        for (j=0; j<3; j++) {
            printf("請輸入陣列arr[%d][%d]元素值:", i, j);
            scanf("%d", &arr[i][j]);
        }
    }

    for (i=0; i<2; i++) {
        for (j=0; j<3; j++) {
            printf("arr[%d][%d]=%d\n", i, j, arr[i][j]);
        }
    }

    /* 另一種表示方法 */
    printf("\n另一種表示方法\n");
    for (i=0; i<2; i++) {
        for (j=0; j<3; j++) {
            printf("arr[%d][%d]=%d\n", i, j, *(arr[i]+j));
            /* 從指標(pointer)中取出值(value) */
        }
    }

    /* 第三種表示方法 */
    printf("\n第三種表示方法\n");
    for (i=0; i<2; i++) {
        for (j=0; j<3; j++) {
            printf("arr[%d][%d]=%d\n", i, j, *(*(arr+i)+j));
            /* 要取出值的指標要括號好 */
        }
    }
    system("PAUSE");

    return 0;
}
