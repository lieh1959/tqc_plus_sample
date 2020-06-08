/* TQC+ C - 801_1 */

#include<stdio.h>
#include<stdlib.h>

int main ()
{
    int i,j;

    for(i=1;i<=5;i++){
    /* 控制行數 */
        for(j=0;j<i;j++) {
        /* 控制幾顆星 */
            printf("*");
        }
        printf("\n");
    }
    system("PAUSE");

    return 0;
}
