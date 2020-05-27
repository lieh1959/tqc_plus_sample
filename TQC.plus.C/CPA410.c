/* TQC+ C - 410 */

#include <stdio.h>
#include <stdlib.h>

int Max(int *, int n, int m);

int main ( )
{
    int arr2[2][3];
    int *pointer = &arr2[0][0];
    int maximum, i, j;

    for (i=0; i<2; i++) {
        for (j=0; j<3; j++) {
            printf("請輸入arr[%d][%d]: ", i, j);
            scanf("%d", &arr2[i][j]);
        }
    }

    printf("\n陣列之值如下:\n");
    for (i=0; i<2; i++) {
        for (j=0; j<3; j++) {
            printf("arr[%d][%d]=%d\n", i, j, arr2[i][j]);
        }
    }

    maximum=Max(pointer, 2, 3);
    /* 僅需要輸入arr2因為其本身就為二維陣列 */
    printf("\n此陣列的最大值為%d\n", maximum);
    system("PAUSE");

    return 0;
}

int Max(int *p, int x, int y)
{
    int i, j, maxi_value=*p; /* 先將指標所指到的值取出 */

    for (i=1; i<(x*y); i++) { /* 記憶體位置總共有六格(2x3=6) */
        if (maxi_value < *(p+i)) {
            maxi_value = *(p+i);
        }
    }

    return maxi_value;
}
