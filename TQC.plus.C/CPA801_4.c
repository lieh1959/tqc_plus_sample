/* TQC+ C - 801_4 */

#include<stdio.h>
#include<stdlib.h>

/* 這題解法僅跟上一題有些差異而已，
 * 把星號跟空白的寫法稍微對換即可
 */
int main ()
{
    int i,j;

    for(i=0;i<=5;i++){
    /* 控制行數 */
        int sp=5-i;  /* 一行內的空白和星號數量是互補的 */

        for(j=0;j<i;j++)  /* 控制空白數 */
            printf(" ");
        for(;sp>0;sp--)  /* 控制星號數 */
            printf("*");
        printf("\n");
    }
    system("PAUSE");

    return 0;
}